package StringDecorators

trait Capitalisation {
  override def toString: String = super.toString.capitalize
}
