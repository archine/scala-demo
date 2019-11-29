package com.gjing.project.scala.demo

/**
 * @author Gjing
 *         泛型
 **/
object TypeDemo {
  def main(args: Array[String]): Unit = {
    val dem = new Demo[Integer]
    dem.setData(2)
    println(dem.toString)
    val i = dem.say("2")
    println(i.getClass)
    println(dem.eat(2))
  }
}

class Demo[T] {
  private var data: T = _

  def setData(t: T) {
    this
    this.data = t
  }

  def say[U](u: U): U = {
    u
  }

  def eat(name: Any): Any = {
    name
  }

  override def toString: String = s"Demo($data)"
}


