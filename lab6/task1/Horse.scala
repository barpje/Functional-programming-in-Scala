class Horse ( var mypos: (Double, Double), var whereHeading: Double ) {
  override def toString = "Horse x: "+mypos._1.toString + " y:"+mypos._2.toString + " dir:"+ whereHeading.toString
  def get_position = mypos
  def set_position(x:Double, y: Double) ={
    mypos = (x,y)
  }
  def get_direction : Double = whereHeading
  def set_direction(dir: Double) = whereHeading = dir
}
