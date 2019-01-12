package lectures.Part1.Values.Var

object Expressions extends App{

  val x = 1 + 2
  //println(x)


  //println(1 + 3 * 2)
  //  + - * /  & | ^ << >> >>> (right shift with 0 extension)

  //println(1 == x)
  // == != > >= < <=

  //println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3
  // -= *= /= ... side effects

  // Instructions (DO)
  // Expressions (VALUE)

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  //println(aConditionValue)
  //println(if(!(aCondition)) 5 else 3)

  val aWierdValue = (aVariable = 3)
  println(aWierdValue)
  // side effect type Unit(void)

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "bye"
  }



}
