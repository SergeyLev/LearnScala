package lectures.part3fp

object AnonymousFunctions extends App{
  //LAMBDA
  // single param
  val doubler = (x: Int) => x * 2
  val doubler1: Int => Int = x => x * 2

  // multiple params
  val adder = (a: Int, b: Int) => a + b
  val adder1: (Int, Int) => Int = (a, b) => a + b

  // no params
  val doSomething = () => 3
  val doSomething1: () => Int = () => 3

  // curly braces with lambda
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // more sugar
  val niceIncrementer: Int => Int = (x: Int) => x + 1
  val nicerIncrementer: Int => Int = _ + 1

  val niceAdder: (Int, Int) => Int = _ + _

  def superAdder= (x: Int) => (y: Int) => x + y


}
