class Car ( var xpos: Double , var ypos: Double , var direction: Double ) {
  override def toString = "Car x: "+xpos.toString + " y:"+ypos.toString + " dir:"+direction.toString

  def get_position = (xpos, ypos)
  def set_position(x:Double, y: Double) ={
    xpos = x
    ypos = y
  }
  def get_direction = direction
  def set_direction(dir: Double) = direction = dir

}
