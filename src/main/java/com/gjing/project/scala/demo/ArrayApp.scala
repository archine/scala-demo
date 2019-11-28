package com.gjing.project.scala.demo

import scala.collection.mutable.ArrayBuffer

/**
 * 定长数组和可变数组
 *
 * @author Gjing
 **/
object ArrayApp extends App {
  //不可变数组
  val a = new Array[Integer](5)
  println(a.length)
  a(0) = 1
  a(1) = 2
  println(a.mkString(","))

  println("--------------------------------")
  //可变数组
  private val c: ArrayBuffer[Int] = scala.collection.mutable.ArrayBuffer[Int]()
  c+=1
  println(c)
  for (i <- 0 until c.length) {
    println(c(i))
  }
}
