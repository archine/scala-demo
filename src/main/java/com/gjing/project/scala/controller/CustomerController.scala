package com.gjing.project.scala.controller

import cn.gjing.tools.common.annotation.NotEmpty
import cn.gjing.tools.common.result.PageResult
import com.gjing.project.scala.entity.Customer
import com.gjing.project.scala.service.CustomerService
import io.swagger.annotations.{Api, ApiImplicitParam, ApiImplicitParams, ApiOperation}
import javax.annotation.Resource
import org.springframework.data.domain.PageRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RestController}

/**
 * @author Gjing
 **/
@RestController
@Api(tags = Array("用户的相关功能"))
class CustomerController @Resource()(customerService:CustomerService){
  @PostMapping(Array("/customer"))
  @ApiOperation("添加用户")
  @ApiImplicitParam(name = "customerName",value = "用户名",dataType = "String",required = true,paramType = "query")
  @NotEmpty
  def saveCustomer(customerName:String): ResponseEntity[String] ={
    customerService.saveCustomer(customerName)
    ResponseEntity.ok("添加成功")
  }

  @GetMapping(Array("/customer_page"))
  @ApiOperation("分页查询")
  @ApiImplicitParams(Array(
    new ApiImplicitParam(name = "page",value = "页数",required = true,dataType = "int",paramType = "query"),
    new ApiImplicitParam(name = "size",value = "条数",required = true,dataType = "int",paramType = "query"),
  ))
  def pageCustomer(page:Int,size:Int): ResponseEntity[PageResult[java.util.List[Customer]]]={
    ResponseEntity.ok(customerService.pageCustomer(PageRequest.of(page, size)))
  }
}
