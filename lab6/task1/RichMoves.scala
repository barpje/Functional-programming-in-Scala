trait RichMoves {
  def get_position : (Double, Double)
  def set_position(x: Double, y: Double) : Unit
  def set_direction(dir: Double)
  def get_direction :Double

  def turnLeft = set_direction(get_direction - 45)
  def turnRight = set_direction(get_direction + 45)
  def turnBack = set_direction(get_direction - 180)

  def forward(p: Double) = {
    var mypos = get_position
    val xpos: Double = mypos._1 + p*math.cos(get_direction)
    val ypos: Double = mypos._2 + p*math.sin(get_direction)
    set_position(xpos, ypos)
    }
}
