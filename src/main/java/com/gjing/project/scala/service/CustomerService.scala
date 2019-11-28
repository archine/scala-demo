package com.gjing.project.scala.service

import cn.gjing.tools.common.result.PageResult
import com.gjing.project.scala.entity.Customer
import com.gjing.project.scala.exceptions.MyServiceException
import com.gjing.project.scala.repository.CustomerRepository
import javax.annotation.Resource
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

/**
 * @author Gjing
 **/
@Service
class CustomerService @Resource()(customerRepository: CustomerRepository){
  /**
   * 保存用户
   * @param name 用户名
   */
  def saveCustomer(name:String): Unit = {
    var customer = customerRepository.findByCustomerName(name)
    if (customer != null) {
      throw MyServiceException("添加失败，用户已存在")
    }
    customer = new Customer(name)
    customerRepository.save(customer)
  }

  /**
   * 分页查询
   * @param pageable 分页对象
   * @return
   */
  def pageCustomer(pageable:Pageable): PageResult[java.util.List[Customer]] = {
    val page = customerRepository.findAll(pageable)
    return PageResult.of(page.getContent, page.getTotalPages,page.getSize,page.getTotalElements,page.getNumber)
  }
}
