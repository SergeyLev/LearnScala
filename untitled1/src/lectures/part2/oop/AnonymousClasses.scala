package lectures.part2.oop

object AnonymousClasses extends App{

  trait Animal{
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahah")
  }
  println(funnyAnimal.getClass)

  class Person(name: String){
    def sayHi: Unit = println(s"Hi, $name!")
  }

  val jim = new Person("Jim")
}
