package lectures.part2.oop

import scala.reflect.runtime.ReflectionUtils.PrimitiveOrArray

object MethNotations extends App{

  class Person(val name: String, favMovie: String, age: Int = 0){
    def likes(movie: String): Boolean = movie == favMovie
    def hangOut(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name, I am $age years old and I like $favMovie."

    def +(nick: String) : Person = new Person(s"$name ($nick)", favMovie, age)
    def unary_+ : Person = new Person(name, favMovie, age + 1)
    def learns(subj: String): String = s"$name learns $subj"
    def learnScala: String = learns("Scala")
    def apply(num: Int): String = s"$name wathed $favMovie $num times"

  }


  val mary = new Person("Mary", "Inception", 25)
  println(mary.likes("Inception"))
  // infix
  println(mary likes "Inception")

  val tom = new Person("Tom", "Fight Club", 30)

  println(mary hangOut tom)

  // prefix
  val x = -1
  val y = 1.unary_-
  println(!mary)

  //postfix
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary())
  println("\n")

  // exercise
  println((mary + "rock star")())
  println((mary + "rock star")(2))

  println("\n")
  println((+mary)())

  println("\n")
  println(mary learns "Scaloooo")
  println(mary learnScala)


}
