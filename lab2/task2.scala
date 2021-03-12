object task2 {
  def sumfrac(eps: Double) : Double={
    @scala.annotation.tailrec
    def tail(sol: Double, x: Int): Double = if (1.0/x < eps) sol else tail(sol + (1.0/x), x + 1)
    tail(0,1)

  }
  def main(args: Array[String]) : Unit ={
    println(sumfrac(1e-3))
    println(sumfrac(1e-9))

  }
}
