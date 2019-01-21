package com.scala.oop.commands
import com.scala.oop.filesystem.State

class Echo(args: Array[String]) extends Command {
  override def apply(state: State): State = {

    if (args.isEmpty) state
    else if (args.length == 1) state.setMessage(args(0))
    else {
      val operator = args(args.length - 2)
      val filename = args(args.length - 1)
      val content = createContent(args, args.length - 2)

    }

  }

  def createContent(args: Array[String], topIndex: Int): String = ???
}
