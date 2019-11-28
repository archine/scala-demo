package com.gjing.project.scala.demo

/**
 * 匿名函数
 * @author Gjing
 **/
object FunctionDemo {

  def main(args: Array[String]): Unit = {
    hello("11")
    hello2("你好")
  }

  def hello(value:String): Unit ={
    printf("普通函数%s\n",value)
  }

  private val hello2  = (value:String) => println(value)
}
