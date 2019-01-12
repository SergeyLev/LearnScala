package lectures.part2.oop

object Inheritance extends App{

  class Animal{
    // final prevents overriding
    def eat = println("nomnomnom")
    val creatureType = "wild"
  }

  class Cat extends Animal

  val cat = new Cat{
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  cat crunch

  //constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // cverriding
 /* class Dog extends Animal{
    override def eat = println("munch munch")
    //override val creatureType = "domestic"
  }*/

  class Dog(dogType: String)  extends Animal{
    override def eat = {
      // super
      super.eat
      println("munch munch")
    }
    override val creatureType = dogType
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  //type substitution
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat



}
