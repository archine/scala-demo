package com.gjing.project.scala.demo

import scala.util.Random

/**
 * @author Gjing
 **/
object SwitchDemo {
  def main(args: Array[String]): Unit = {
    val names = Array(1, 2, 3)
    //    val name = names(Random.nextInt(names.length))
    //    name match {
    //      case 1 => println(1)
    //      case 2 => println(2)
    //      case _ if (name == 3)=> println(3)
    //    }
    test1(names)
    test2(1 :: 2 :: 3 :: Nil)
    test3(1)
    test4(new Scala("scala"))
  }

  /**
   * 匹配数组
   *
   * @param array 数组
   */
  def test1(array: Array[Int]): Unit = {
    array match {
      case Array(1) => println(1)
      case Array(2) => println(2)
      case Array(1, _*) => println("太多了输出不过来")
      case _ => println("不知道你写的啥玩意")
    }
  }

  /**
   * 匹配集合
   *
   * @param list 集合
   */
  def test2(list: List[Int]): Unit = {
    list match {
      case 1 :: Nil => println(1)
      case 2 :: Nil => println(2)
      case 1 :: 4 :: Nil => println(3, 4)
      case _ => println(0)
    }
  }

  /**
   * 类型匹配
   *
   * @param param 参数
   */
  def test3(param: Any): Unit = {
    param match {
      case param: String => println("是个字符串")
      case param: Int => println("是个数字")
      case _ => println("未知类型")
    }
  }

  //------------------------- case class匹配----------------------------
  class Language
  case class Java(name: String) extends Language
  case class Scala(name:String) extends Language

  def test4(language: Language): Unit ={
    language match {
      case Java(name:String) => println("是java")
      case Scala(name:String) => println("是Scala")
      case _ => println("不知道是啥了哈")
    }
  }

}
