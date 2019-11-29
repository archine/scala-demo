package com.gjing.project.scala.exceptions

import cn.gjing.tools.common.result.ErrorResult
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{ExceptionHandler, RestControllerAdvice}

/**
 * @author Gjing
 **/
@RestControllerAdvice
class MyGlobalExceptionHandler{

  @ExceptionHandler(Array(classOf[MyServiceException]))
  def mx(myServiceException: MyServiceException): ResponseEntity[ErrorResult]={
    ResponseEntity.badRequest().body(ErrorResult.failure(myServiceException.getMessage))
  }

  @ExceptionHandler(Array(classOf[Exception]))
  def ex(exception: Exception):  ResponseEntity[ErrorResult] = {
    exception.printStackTrace()
    ResponseEntity.badRequest().body(ErrorResult.failure("操作失败"))
  }
}
