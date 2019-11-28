package com.gjing.project.scala.demo

/**
 * 伴生类和伴生对象
 * @author Gjing
 **/
object Demo4 {
  def main(args: Array[String]): Unit = {
//    println(ApplyTest.age)
    ApplyTest.apply()
    val b = new ApplyTest()
    b()
  }
}

class ApplyTest{

  def apply(): ApplyTest = {
    println("啦啦啦")
    new ApplyTest()
  }
}

object ApplyTest{
  val age = 10

  def apply(): ApplyTest = {
    println("啦啦啦2")
    new ApplyTest()
  }
}
