package lectures.Part1.Values.Var

import scala.annotation.tailrec

object DefArgs extends App{

    def factHelper(x: Int, acc: BigInt = 1): BigInt =
      if (x <= 1) acc
      else factHelper(x - 1, x * acc) //TAIL RECURSION

  println(factHelper(5000))

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture(height = 800, format = "bmp", width = 600)

}
