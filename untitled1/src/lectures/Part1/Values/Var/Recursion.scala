package lectures.Part1.Values.Var

import scala.annotation.tailrec

object Recursion extends App{

  /*def aFactorial(n: Int): Int = {
    if(n <= 1) {
      println("Factorial of 1 is 1")
      1
    }
    else {
      println("Getting factorial of " + n + " first need factorial of " + (n - 1))
      val result = n * aFactorial(n - 1)
      println("Factorial of " + n + " is " + result)
      result
    }
    }

  println(aFactorial(10))*/


  def smartFactorial(m: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, acc: BigInt): BigInt =
      if (x <= 1) acc
      else factHelper(x - 1, x * acc) //TAIL RECURSION

    factHelper(m,1)
  }

  println(smartFactorial(5000))

  def aConcat(name: String, age: Int, times: Int): String = {
    @tailrec
    val greet = "Hi, my name is " + name + " and I am " + age + " years old."
    def aGreeting(x: Int, acc: String): String =
      if(x <= 1) acc
      else aGreeting(x - 1, acc + acc)

    aGreeting(times, greet)

  }
  println(aConcat("Sergej", 35, 5))



  def ifPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTill(t: Int, acc: Boolean): Boolean =
      if(!acc) false
      else if(t <= 1) true
      else {
        isPrimeTill(t - 1, n % t != 0 && acc)
      }

    isPrimeTill( n / 2, true)
  }
  println(ifPrime(38))



  def aFibonnacci(n: Int): Int = {
    @tailrec
    def tailFibo(i: Int, last: Int, nextToLast: Int): Int =
    if (i >= n) last
    else tailFibo(i + 1, last + nextToLast, last)

    if(n <= 2) 1
    else tailFibo(2, 1, 1)
  }
  println(aFibonnacci(8))


  }




