package lectures.part2.oop

object Exceptions extends App{

  val x: String = null
  //println(x.length)

  // throw catch exceptions

  //val aWierdValue = throw new NullPointerException

  // how to catch exceptions

  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No Int For You")
    else 42

  val potentialFail = try{
    getInt(false)

  } catch {
    case e: RuntimeException => println("cought a Runtime exception")
  } finally {
    println("finally")
  }

  println(potentialFail)

  // define exceptions
  class MyException extends Exception
  val exception = new MyException

  //throw exception

  // OOM
  //val array = Array.ofDim(Int.MaxValue)

  // SO
  //def infRec: Int = 1 + infRec
  //val noLimit = infRec
  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")


  object PocketCalculator{
    def add(x: Int, y: Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int) = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int) ={
      val result = x * y
      if(x > 0 && y > 0 && result < 0) throw new OverflowException
      else if(x < 0 && y < 0 && result < 0) throw new OverflowException
      else if(x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if(x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def divide(x: Int, y: Int) ={
      val result = x / y
      if (y == 0) throw new MathCalculationException
      else result
    }
  }

  println(PocketCalculator.add(Int.MaxValue, 10))
  println(PocketCalculator.divide(2, 0))


}
