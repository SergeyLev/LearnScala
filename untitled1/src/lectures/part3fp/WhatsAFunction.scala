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

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }
}

trait MyFunction[A, B]{
  def apply(element: A): B
}
