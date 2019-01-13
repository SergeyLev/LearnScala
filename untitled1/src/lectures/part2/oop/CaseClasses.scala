package lectures.part2.oop

object CaseClasses extends App{

  case class Person(name: String, age: Int)
  val jim = new Person("Jim", 34)

  // 1. parameters are fields
  // 2. toString
  // println(jim) = println(jim.toString)
  println(jim)

  // 3. = and # implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. has copy method

  val jim3 = jim.copy()
  val jim4 = jim.copy(age = 45)
  println(jim3, jim4)

  // 5. CC has companion classes
  val thePerson = Person
  val mary = Person("Mary", 23)

  // 6. CCs are serializable

  // 7. CCs have extractor patterns = CCs can be used in Pattern Matching

  case object UnitedKingdom{
    def name: String = "The UK of GB and Northern Ireland"
  }


}
