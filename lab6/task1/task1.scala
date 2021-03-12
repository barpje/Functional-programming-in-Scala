object task1 {
  def main(args: Array[String]) : Unit={
    val car1 = new Car(0, 0, 0)
    println(car1)
    val car2 = new Car(1, 0, 90)
    println(car2)

    val betterCar = new Car ( 0, 0, 0) with RichMoves
    println(betterCar)
    betterCar.forward(5.0)
    betterCar.turnLeft
    betterCar.forward(4.0)
    println(betterCar)
    betterCar.turnBack
    betterCar.forward(1)
    println(betterCar)
    val runner = new Horse( (1,1), 270 ) with RichMoves
  }
}
