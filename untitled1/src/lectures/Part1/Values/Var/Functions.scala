package lectures.Part1.Values.Var
import scala.math.sqrt
object Functions extends App {

  /*def aFunction(a: String, b:Int): String =
    a + "" + b

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello ", 3))*/

  def aGreeting(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."

  println(aGreeting("Sergej", 35))

  def aFactorial(n: Int): Int = {
    if(n <= 0) 1
    else n * aFactorial(n - 1)
  }
  println(aFactorial(5))

    def aFibonnacci(n: Int): Int = {
      if (n == 1 || n == 2) 1
      else aFibonnacci(n - 1) + aFibonnacci(n - 2)
    }
  println(aFibonnacci(12))

  def ifPrime(i: Int): Boolean = {
    def isPrimeTill(t: Int): Boolean =
      if(t <= 1) true
      else i % t != 0 && isPrimeTill(t-1)

    isPrimeTill( i / 2)
  }

  println(ifPrime(37))
  println(ifPrime(20015))

}
