package com.scala.oop.commands
import com.scala.oop.files.Directory
import com.scala.oop.filesystem.State

class Rm(name: String) extends Command {

  override def apply(state: State): State = {
    // get wd
    val wd = state.wd
    // get absolute path
    val absolutePath =
      if (name.startsWith(Directory.SEPARATOR)) name
      else if (wd.isRoot) wd.path + name
      else wd.path + Directory.SEPARATOR + name
    // do checks
    if (Directory.ROOT_PATH == absolutePath)
      state.setMessage("Nuclear war is not supported!")
    else
      doRM(state, absolutePath)
  }

  def doRM(state: State, path: String): State = {
    def rmHelper(currentDirectory: Directory, path: List[String]): Directory = {
      if (path.isEmpty) currentDirectory
      else if (path.tail.isEmpty) currentDirectory.removeEntry(path.head)
      else {
        val nextDirectory = currentDirectory.findEntry(path.head)
        if (!nextDirectory.isDirectory) currentDirectory
        else {
          val newNextDirectory = rmHelper(nextDirectory.asDirectory, path.tail)
          if (newNextDirectory == nextDirectory) currentDirectory
          else currentDirectory.replaceEntry(path.head, newNextDirectory)
        }
      }
    }

    // find entry to rm
    // update structure
    val tokens = path.substring(1).split(Directory.SEPARATOR).toList
    val newRoot: Directory = rmHelper(state.root, tokens)

    if (newRoot == state.root)
      state.setMessage(path + ": no such file or directory!")
    else
      State(newRoot, newRoot.findDescendant(state.wd.path.substring(1)))
  }

}
