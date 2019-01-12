package lectures.part2.oop

object AbstractDataTypes extends App{

  //abstract = thing
  abstract class Animal{
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    override def eat: Unit = println("munch munch")
  }

  // traits = behavior
  trait Carnivore{
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore{
    val creatureType: String = "croc"
    def eat: Unit = println("nom nom nom")

    def eat(animal: Animal): Unit = println(s"I am $creatureType and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
  croc.eat
}
