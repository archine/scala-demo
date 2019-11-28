package com.gjing.project.scala.controller

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.{GetMapping, RestController}

/**
 * @author Gjing
 **/
@RestController
class TestController {

  @GetMapping(Array("/test"))
  @ApiOperation("scala测试")
  def test(): String = {
    "ok"
  }
}
