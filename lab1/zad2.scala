object zad2 {
  def main(args: Array[String]): Unit={
    val y = Array.ofDim[Int](4,5)
    for ( i <- 0 until 4; j <- 0 until 5) y(i)(j) = i*j
    nicePrint(y)

  }
  def nicePrint(arg: Array[Array[Int]]):Unit={
    def nicePrintRow(arg:Array[Int]):Unit={
      //arg foreach {col => print(col + " ")} //different way
      for(col <- arg) print(col + " ")
      println()
    }
    for ( row <- arg ) nicePrintRow(row)
    //arg foreach {row => nicePrintRow(row)} //different way
  }
}
