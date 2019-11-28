package com.gjing.project.scala.demo

/**
 * case class
 * @author Gjing
 **/
object Demo5 {
  def main(args: Array[String]): Unit = {
    println(Dog("小花狗"))
  }
}

/**
 * case class不需要new
 * @param name 名称
 */
case class Dog(name:String)
