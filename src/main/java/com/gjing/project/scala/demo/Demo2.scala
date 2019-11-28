package com.gjing.project.scala.demo

/**
 * 继承
 * @author Gjing
 **/
object Demo2 {
  def main(args: Array[String]): Unit = {
    val man = new Man(10,"小拉拉","程序员")
    println(man.toString)
    println(man.name)
  }
}

class Man(age:Int,name:String,var role:String) extends Person(age,name){
  override def toString = s"Man($role,$age,$name,$gender)"
}
