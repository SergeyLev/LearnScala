package lectures.part2.oop

import sandbox.{Cinderella => Princess, PrinceCharming}
import java.util.Date
import java.sql.{Date => SqlDate}

//import sandbox.Cinderella

object PackagingImports extends App{

  // Package members accessible by name
  val writer = new Writer("Daniel", "BlaBla", 2018)

  // import the package
  val princess = new Princess
  //val princess = new Cinderella
  // val princess = new sandbox.Cinderella


  // from Object Package
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

  val date = new Date
  val sqlDate = new SqlDate(2018, 5, 4)

  // default imports
  // java.lang - String, Objects, Exceptions
  // scala - Int, Nothing, Function
  // scala.predef - ???, println


}
