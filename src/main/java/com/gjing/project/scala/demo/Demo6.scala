package com.gjing.project.scala.demo

/**
 * trait接口
 * @author Gjing
 **/
object Demo6 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig
    pig.name()
  }
}

trait Animal{
  def name()
}

class Pig extends Animal{
  override def name(): Unit = {
    println("我是小动物")
  }
}
