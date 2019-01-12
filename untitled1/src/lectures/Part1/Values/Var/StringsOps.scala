package lectures.Part1.Values.Var
import java.time.Year
object StringsOps extends App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // S-Interpolator
  val name = "Sergej"
  val age = 35
  val greet = s"Hello, my name is $name, and I am $age years old"
  val greet2 = s"Hello, my name is $name, and I am turning ${Year.now.getValue - 1984} years old this year"
  println(greet)
  println(greet2)

  // F-Interpolator
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-Interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline escaped"
  println(escaped)
}
