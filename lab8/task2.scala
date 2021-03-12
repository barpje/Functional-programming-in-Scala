import math.max
object task1{
  def repeated[A](arg: Seq[A]): List[(A,Int)]= {
    var nod = arg.groupBy(identity).map(t => (t._1, t._2.size))
    var res = nod.filter( x => x._2 > 1)
    res.toList
  }
  /*
  def condMerge[A](arg1: Seq[A], arg2: Seq[A],pred: ((A, A))=> Int) :List[A]={
    var listT = (arg1 zip arg2).toList

  }*/
  def main(args: Array[String]) : Unit={
    println(repeated(List(-8,5,6,1,4,4,2,5,-1,9,9))) // prints List(5, 9, 4)
    println(repeated("Hello world")) // prints List(l, o)
   // val m = condMerge(List(2,-9,1,8), Vector(3,-2,45,2), { case x: Tuple2[Int,Int] if max(x._1, x._2) > 0 => max(x._1,x._2) } )
    //println(m) // prints List(3, 45, 8)
  }
}
/*
The goal is to write functions with maximal use of
collection operations (solutions with for loops do not count):

a) funtion to find repeated elements in any type of Seq
b) function that looks synchronously through two collections
and according to the supplied function collects data from the two inputs
*/


