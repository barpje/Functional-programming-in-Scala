package StringDecorators

trait PageStretch {
  val llen: Int = 0

  override def toString: String = {
    if(llen != 0) {
      val spaces: String = " " * llen
      super.toString.split(" ").mkString(spaces)
    }
    else{
      super.toString.split(" ").mkString("\t\t\t")
    }
  }
}
