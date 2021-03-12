import scala.annotation.tailrec
object l4t1 {
  def filterList(args: List[String], pred: (String)=>Boolean):List[String]={
    var sol : List[String] = Nil
    @scala.annotation.tailrec
    def filter(list: List[String]): Unit={
      if(list.isEmpty) return
      if (pred(list.head)){
        sol = sol :+ list.head
      }
      filter(list.tail)
    }
    filter(args)
    sol
  }
  def reverseList(list: List[String]): List[String] = {
    var sol : List[String] = Nil
    @scala.annotation.tailrec
    def reverse(list: List[String]): Unit = {
      if (list.isEmpty) return
      sol = list.head +: sol
      reverse(list.tail)
    }
    reverse(list)
    sol
  }
  def main(args: Array[String]):Unit={
    val pred1 = (x: String) => x.contains('p')
    println(filterList(List("Hello", "there", "people"), pred1))
    println(reverseList(List("Hello", "there", "people")))
  }
}
