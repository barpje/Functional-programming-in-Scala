import scala.annotation.tailrec
object task2  {
  def typer(x: Any): String = {
    if(x.isInstanceOf[Int]) return "Int(" + x.toString + ") "
    if(x.isInstanceOf[Double]) return "Double(" + x.toString + ") "
    if(x.isInstanceOf[String]) return "String(" + x + ") "
    return ""
  }
/* good version
    def typer(x: Any): String = x match {
      case i: Int => "Int(" + x.toString + ") "
      case d: Double => "Double(" + x.toString + ") "
      case s: String => "String(" + x + ") "
      }
   */
  def stream(list: List[Any]) : String = {
    @tailrec
    def traversal(l: List[Any], str: String = " "):String = l match{
      case Nil => str
      case x :: lister => traversal(lister, str + typer(x))
    }
    traversal(list)
  }
 def main(args: Array[String]) : Unit={
    val l = List(1, "hello", 2.56, 0x45, "key")
    println(stream(l))
  }
}
/*
The goal is to write a function that will serialize a heterogeneous list of objects.

val streamed = stream(l)
// should result in: Int(1) String(hello) Double(2.56) Int(69) String(key)
The implementation should use tail-recursive list traversal where
empty list condition is implemented with expression matching.
The list element type discovery should also be done with expressions matching.
 */