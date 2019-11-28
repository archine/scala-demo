package com.gjing.project.scala.demo

/**
 * 柱构造器和辅助构造器
 * @author Gjing
 **/
object Demo1 {
  def main(args: Array[String]): Unit = {
    val person = new Person(10, "小王")
    println(person.toString)
    val person2 = new Person("男")
    println(person2.toString)
  }
}

/**
 * 人类
 * @param age 年龄
 * @param name 名字
 */
class Person(var age:Int,var name:String){
  var gender:String = "女"

  def this(gender:String){
    this(10,"小红")
    this.gender = gender
  }


  override def toString = s"Person($gender, $age, $name)"

}
