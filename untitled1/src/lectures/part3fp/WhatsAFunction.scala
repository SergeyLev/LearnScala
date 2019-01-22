package lectures.part3fp

object WhatsAFunction extends App{

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int =
      element * 2
  }

  println(doubler(2))

  val stringToIntConverter = new Function[String, Int] {
    override def apply(v1: String): Int =
      v1.toInt
  }

  println(stringToIntConverter("3") + 4)

  val adder: (Int, Int) => Int =
    (v1: Int, v2: Int) => v1 + v2

  println(adder(2, 5))

  def concat: (String, String) => String =
    (v1: String, v2: String) => v1 ++ v2

  println(concat("Hello ", "world"))


  def superAdder: Int => Int => Int = (x: Int) => (y: Int) => x + y


 /* val specFunc: (Function1[Int, Function1[Int, Int]]) = new Function1[Int, Function1[Int, Int]]{
    override def apply(x: Int): Int => Int = new Function[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }*/

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4))
}

trait MyFunction[A, B]{
  def apply(element: A): B
}
