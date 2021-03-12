package StringDecorators

trait htmlI {
  override def toString : String = "<I>" + super.toString + "</I>"
}
