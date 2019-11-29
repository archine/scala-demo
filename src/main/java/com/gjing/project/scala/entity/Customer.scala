package com.gjing.project.scala.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
 * @author Gjing
 **/
@Entity
@Table(name = "scala_customer")
class Customer extends {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id:Integer = _

  @BeanProperty
  var customerName:String = _

  def this(customerName:String){
    this()
    this.customerName = customerName
  }

  override def toString: String = s"Customer($id,$customerName)"
}
