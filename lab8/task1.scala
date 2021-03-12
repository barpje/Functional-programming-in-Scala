class DL[A]{
  private class Node(var data: A, var prev: Node, var next: Node)
  private var Nuller: A = _
  private var tail: Node = new Node(Nuller, null, null)
  var size: Int = 0
  tail.prev = tail
  tail.next = tail
  def add(elem: A): DL.this.type={
    var newElem = new Node(elem, tail, tail.next)
    if(size == 0){
      tail.next = newElem
      tail.prev = newElem
    }else {
      tail.next.prev = newElem
      tail.next = newElem
    }
    size+=1
    this
  }
  def _size : Int = size

  override def toString: String ={
    var str: StringBuilder = new StringBuilder("")
    var ptr: Node = tail
    while(ptr.next != null && ptr.next != tail){
      ptr = ptr.next
    }
    while(ptr.prev != null && ptr.prev != tail){
      str.append(ptr.data + " <=> ")
      ptr = ptr.prev
    }
    str.append(ptr.data)
    str.toString()
  }

}
object task1 {

  def main(args: Array[String]): Unit = {
    val dli = new DL[Int]
    dli.add(1).add(9).add(0).add(7).add(8)
    println(dli)
    val dls = new DL[String]
    dls.add("TO").add("jest").add("DL").add("!")
    println(dls)
  }
}
/*
The goal is to implement generic doubly linked list in scala.
The only method that the list needs to have is "add" and converion to string.
The code below shows how it shoudl work.
 1 <-> 9 <-> 0 <-> 7 <-> 8
 TO <-> jest <-> DL <-> !
 */