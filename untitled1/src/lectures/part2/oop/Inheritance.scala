package lectures.part2.oop

object Inheritance extends App{

  class Animal{
    def eat = println("nomnomnom")
  }

  class Cat extends Animal

  val cat = new Cat

  cat eat

}
