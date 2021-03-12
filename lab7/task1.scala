object Addition {
  def unapply(s: String): Option[(Double, Double)] = {
    if (s.contains('+')) {
      val numbers = s.split('+').map(_.trim)
      Some(numbers(0).toDouble, numbers(1).toDouble)
    } else None
  }
}
object Subtraction {
  def unapply(s: String): Option[(Double, Double)] = {
    if (s.contains('-')) {
      val numbers = s.split('-').map(_.trim)
      Some(numbers(0).toDouble, numbers(1).toDouble)
    } else None
  }
}
object Multiplication {
  def unapply(s: String): Option[(Double, Double)] = {
    if (s.contains('*')) {
      val numbers = s.split('*').map(_.trim)
      Some(numbers(0).toDouble, numbers(1).toDouble)
    } else None
  }
}

object Division {
  def unapply(s: String): Option[(Double, Double)] = {
    if (s.contains('/')) {
      val numbers = s.split('/').map(_.trim)
      if (numbers(1).toDouble == 0) None
      else Some(numbers(0).toDouble, numbers(1).toDouble)
    } else None
  }
}
object task1 {

  def evalEx(arg: String): Double ={
    arg match {
      case Addition(a, b)=> a + b
      case Subtraction(a, b)=> a - b
      case Division(a, b)=> a / b
      case Multiplication(a, b)=> a * b
    }
  }

  def main(args: Array[String]): Unit = {
      println(evalEx("2+5"))
      println(evalEx("2-5"))
      println(evalEx("2*5"))
      println(evalEx("2/5"))
    }
}
  /*The goal is to write extractors for simple numerical expressions and
  a function that would use them in order to do simple calculations. Example:
  val Addition(a, b) = "2 + 6";
  in this case a assumes value 2 and b assumes value b.
  Next with this (and similar) extractors, a function evalEx should be written working as
  in the examples below.
*/

