package com.scala.oop.commands

import com.scala.oop.files.{DirEntry, Directory}
import com.scala.oop.filesystem.State

abstract class CreateEntry(name: String) extends Command {
  override def apply(state: State): State = {
    val wd = state.wd
    if(wd.hasEntry(name)){
      state.setMessage("Entry " + name + " already exists!")
    } else if(name.contains(Directory.SEPARATOR)){
      state.setMessage(name + " must not contain separators!")
    } else if(checkIllegal(name)){
      state.setMessage(name + ": illegal entry name! ")
    } else {
      doCreateEntry(state, name)
    }

  }

  def checkIllegal(str: String): Boolean = {
    name.contains(".")
  }

  def doCreateEntry(state: State, name: String): State = {
    def updateStructure(currentDir: Directory, path: List[String], newEntry: DirEntry): Directory = {
      /* someDir  /a          new someDir  /a
                  /b                       /b
                  /c    =>                 /c
            (new) /d                       /d
      */
      if(path.isEmpty) currentDir.addEntry(newEntry)
      else{
        val oldEntry = currentDir.findEntry(path.head).asDirectory
        currentDir.replaceEntry(oldEntry.name, updateStructure(oldEntry, path.tail, newEntry))
      }

    }

    val wd = state.wd

    // all dir in full path
    val allDirInPath = wd.getAllFoldersInPath

    // create new dir entry in the wd
    val newEntry: DirEntry = createSpecificEntry(state)

    // update whole dir structure from the root
    val newRoot = updateStructure(state.root, allDirInPath, newEntry)

    //find new wd INSTANCE with wd full path in NEW dir structure
    val newWd = newRoot.findDescendant(allDirInPath)

    State(newRoot, newWd)
  }

  def createSpecificEntry(state: State): DirEntry
}
