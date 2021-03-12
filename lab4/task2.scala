object zad extends App {

  class MapPoint(val name: String, val x: Double, val y: Double){
    def -(arg: MapPoint): Double ={
      scala.math.sqrt(scala.math.pow(arg.x - x, 2) + scala.math.pow(arg.y - y, 2))
    }
    def distanceTo(arg: MapPoint) : Double={
      this - arg
    }
    def move(nx: Double, ny: Double):MapPoint={
      MapPoint("Nearby" + name, x + nx, y + ny)
    }
    override def toString() : String={
      val nx = if(x >= 0) x + "N" else -x + "S"
      val ny = if(y >= 0) y + "E" else -y + "W"
      name + " " + nx + " " + ny
    }
  }
    object MapPoint {
      def apply(name: String, x: Double, y: Double) = new MapPoint(name, x, y)
      def inTheMiddle(arg1: MapPoint, arg2: MapPoint, name: String) : MapPoint={
        val nx: Double= (arg1.x + arg2.x) / 2
        val ny: Double = (arg1.y + arg2.y) / 2
        MapPoint(name, nx ,ny)
      }
    }
  class Route(var route: List[MapPoint]){
    def reverseList(arg: List[MapPoint]) : List[MapPoint]={
      var sol: List[MapPoint] = Nil
      @scala.annotation.tailrec
      def reverse(list: List[MapPoint]) : Unit={
        if(list.isEmpty) return
        else{
          sol = list.head +: sol
        }
        reverse(list.tail)
      }
      reverse(arg)
      sol
    }
    def addStop(arg: MapPoint): Unit={
      route = route :+ arg
    }
    override def toString() : String={
      var rev: List[MapPoint] = reverseList(route)
      var sol: String = ""
      while(rev.size > 1){
        sol = sol + rev.head + " -> "
        rev = rev.tail
      }
      sol = sol + rev.head
      sol
    }
  }
  object Route{
    def apply(list: List[MapPoint]) = new Route(list)
  }
  val krk = MapPoint( "Krakow", 50.061389, 19.938333 )
  println( krk )
  val nyc = MapPoint( "NYC", 40.7127, -74.0059 )
  println( nyc )
  val porto = MapPoint( "Porto", 41.162142, -8.621953 )
  val irkutsk = MapPoint( "Irkutsk",  52.283333, 104.283333 )
  println( irkutsk )
  println( porto - irkutsk )
  println( krk - irkutsk )
  println( krk.distanceTo(porto) )
 val mp = MapPoint.inTheMiddle( krk,  irkutsk, "Somwhere in Russia" )
  println( mp+" "+( mp - krk ) +" "+ ( mp - irkutsk ) )


  val r = Route( List(krk, nyc, porto) )
  println( r )
  r.addStop( porto.move( 1, 1 ) )
  r.addStop( irkutsk )
  println( r )
}

/* expected result

Krakow 50.061389N 19.938333E

NYC 40.7127N 74.0059W

Irkutsk 52.283333N 104.283333E

113.45168353092112

84.37426183463258

29.914654160942675

Somwhere in Russia 51.172360999999995N 62.110833E 42.18713091731629 42.18713091731629

Porto 41.162142N 8.621953W -> NYC 40.7127N 74.0059W -> Krakow 50.061389N 19.938333E

Irkutsk 52.283333N 104.283333E -> Nearby Porto 42.162142N 7.6219529999999995W -> Porto 41.162142N 8.621953W -> NYC 40.7127N 74.0059W -> Krakow 50.061389N 19.938333E

 */