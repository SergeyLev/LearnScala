package lectures.part2.oop

object Generics extends App{

class MyList[+A]{
  //use type A
  def add[B >: A](element: B): MyList[B] = ???
}
  class MyMap[Key, Value]

  val listOfInt = new MyList[Int]
  val listOfString = new MyList[String]

  // generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfInt = MyList.empty[Int]

  // variance problem

  class Animal
  class Dog extends Animal
  class Cat extends Animal

  // list[Cat] extends list[Animal]

  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // invariance
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // Contravariant

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  //val newCage = new Cage(Car)
}
