object task1 {
  def filterList(arg: List[String], pred: String=>Boolean) : List[String]={
    var sol: List[String] = Nil
    @scala.annotation.tailrec
    def filter(list: List[String]) : Unit={
      if(list.isEmpty) return
      else if(pred(list.head)){
        sol = sol :+ list.head
      }
      filter(list.tail)
    }
    filter(arg)
    sol
  }
  def reverseList(arg: List[String]) : List[String]={
    var sol: List[String] = Nil
    @scala.annotation.tailrec
    def reverse(list: List[String]) : Unit={
      if(list.isEmpty) return
      else{
        sol = list.head +: sol
      }
      reverse(list.tail)
    }
    reverse(arg)
    sol
  }
  def main(args: Array[String]):Unit={
    println(filterList(List("Hello", "there", "people"), _.contains('p')))
    println(filterList(List("Hello", "there", "people"), _.contains('o')))
    println(reverseList(List("Hello", "there", "people")))
    println(reverseList(List("1: Test", "2: Test", "3: Test")))
  }
}
