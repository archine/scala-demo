package com.gjing.project.scala.exceptions

/**
 * @author Gjing
 **/
case class MyServiceException(message:String) extends RuntimeException(message)
