package StringDecorators

trait htmlH2 {
  override def toString: String = "<H2>" + super.toString + "</H2>"
}

