object task1 {
  val f1 = (arg: Double) => arg * 4
  val f2 = (arg: Double) => arg * arg
  def fn (arg: Double) = (arg1: Double) => math.pow(arg, arg1)
  def eval(fn: List[(Double)=>Double], arg: Double):Double={
    fn.foldLeft(arg)((acc,curr) => curr(acc) )
    //Function.chain(fn)(arg)

  }
  def main(args: Array[String])={
    val l2 = List(f1, f2, fn(5))
    println(fn(5)(f2(f1(2))))
    println(eval(l2, 2))
  }
}