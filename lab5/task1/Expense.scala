class Expense(val _price: Double, val _name: String, val _category: String){
  override def toString: String = "Name: " + _name + ", category: " + _category + ", price: " + _price
}
object Expense{
  def apply(price: Double, name: String, category: String) = new Expense(price, name, category)
}
