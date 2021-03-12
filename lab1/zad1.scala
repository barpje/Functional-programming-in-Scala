object zad1 {
  def main(args: Array[String]): Unit={
      call(args(1), args(0))
  }
  def call(arg: String, valu: String): Unit = {
    if (arg =="rad") calculate_rad(valu) else calculate_deg(valu)
  }
  def calculate_rad(arg: String) : Unit={
    println("sin: " + math.sin(arg.toDouble))
    println("cos: " + math.cos(arg.toDouble))
    println("tan: " + math.tan(arg.toDouble))
  }
  def calculate_deg(arg:String): Unit= {
    calculate_rad((arg.toDouble*math.Pi/180).toString)
  }
}
