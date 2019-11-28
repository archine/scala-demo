package com.gjing.project.scala.demo

/**
 * 抽象类
 * @author Gjing
 **/
object Demo3 {
  def main(args: Array[String]): Unit = {
    val man = new Man2
    man.speak()
    man.eat()
    println(man.age)
  }
}

/**
 * 类的一个或者多个方法没有完整地实现（只有定义，没有实现）
 */
abstract class Person3{
  var age:Int
  def speak()
  def eat(): Unit ={
    println("吃饭")
  }
}

class Man2 extends Person3 {
  def speak(): Unit = {
    println("说话")
  }

  override var age: Int = 1
}
