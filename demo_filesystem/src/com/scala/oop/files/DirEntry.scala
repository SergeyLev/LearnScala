package com.scala.oop.files

abstract class DirEntry(val parentPath: String, val name: String) {
  def path: String = {
    val separatorIfNeeded =
      if (Directory.ROOT_PATH.equals(parentPath)) ""
      else Directory.ROOT_PATH
    parentPath + separatorIfNeeded + name
  }

  def asDirectory: Directory
  def asFile: File

  def isDirectory: Boolean
  def isFile: Boolean
  def getType: String
}
