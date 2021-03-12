object task2 {
  class Meat {}
  class Plants{}
  abstract class Animal extends Meat{
    def eat[A](arg: A)={
      arg match{
        case p: Plants =>
      }
    }
  }

  class Carrot extends Plants{
    def eat(arg: Meat)={
      println(this + "OK")
  }
  class Wolf extends Animal{
    def eat(arg: Meat)={
      println(this + "OK")
    }
  }
  class Rabbit extends Animal{}
  def main(args: Array[String]) : Unit={
    val c: Plants = new Carrot
    val r = new Rabbit

    val w = new Wolf

    // this two shold compile and run w/o problems

    r.eat(c)
    w.eat(r)
    // whereas these should not compile
    r.eat(r)
    w.eat(c)
  }
}


/*

The goal is to write
classes/traits which element allow to write a hierarchy of consumers & consumed.
 Following entities exist: Carrot, Rabbit, Wolf, Meat, Plants, Animal.

Expected result:
  Rabbit crunches the  Carrot
    Wolf tears apart the Rabit
*/