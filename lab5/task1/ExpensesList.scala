class ExpensesList {
  var myList : List[Expense] = Nil
  def +=(arg: Expense):Unit={
    myList = myList :+ arg
  }
  def printList() = println(myList.mkString("  ->  "))
  def sum(): Double={
    var sum: Double = 0.0
    for (e<-myList) sum += e._price
    sum
  }
  def max = myList.maxBy(el=>el._price).toString()
}
object ExpensesList{
  def apply() = new ExpensesList
}
