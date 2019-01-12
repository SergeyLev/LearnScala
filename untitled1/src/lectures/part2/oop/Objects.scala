package lectures.part2.oop

object Objects extends App{

  object Person{
    val N_EYES = 2
    def canFly: Boolean = false


    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(name: String){

  }

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object is singleton instance (static)

  val mary = new Person("Mary")
  val john = new Person("John")

  val bobby = Person(mary, john)

  //scala applications = scala object with
  //def main(args: Array[String]): Unit

}
