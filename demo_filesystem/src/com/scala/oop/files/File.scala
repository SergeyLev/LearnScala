package com.scala.oop.files

import java.nio.file.FileSystemException

import com.scala.oop.filesystem.FilesystemException

class File(override val parentPath: String,
           override val name: String,
           contents: String)
    extends DirEntry(parentPath, name) {
  def asDirectory: Directory =
    throw new FilesystemException("A file cannot be converted to a directory!")

  override def asFile: File = this

  def isDirectory: Boolean = false
  def isFile: Boolean = true
  def getType: String = "File"

}

object File {
  def empty(parentPath: String, name: String): File =
    new File(parentPath, name, "")

}
