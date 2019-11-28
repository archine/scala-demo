package com.gjing.project.scala.demo

/**
 * 异常处理
 * @author Gjing
 **/
object ExResolver {
  def main(args: Array[String]): Unit = {
    try {
      println(2 / 0)
    } catch {
      case e: ArithmeticException => println("错误的请求")
    }
  }
}
