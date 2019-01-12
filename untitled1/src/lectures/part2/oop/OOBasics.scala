package lectures.part2.oop

object OOBasics extends App{

  val person = new Person("Sergej", 35)
  println(person.age)
  person.greet("Vasilij")


  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter

  counter.inc(5).current

}



//constructor
class Person(name: String, val age: Int)  {
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John")
   }


class Novel(name: String, year: Int, author: Writer){
  def authorAge: String = f"Author was ${this.year - author.year} old when novel was released"
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Writer(name: String, lastname: String, val year: Int){
  def sayName: String = s"${this.name} ${this.lastname}"
}

class Counter(val counter: Int = 0){


  def inc = new Counter(counter + 1)
  def dec = new Counter(counter - 1)

  def inc(n: Int) = new Counter(counter + n)
  def dec(n: Int) = new Counter(counter - n)

  def current = println(s"Current count is $counter")
}