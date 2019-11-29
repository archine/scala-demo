package com.gjing.project.scala.repository

import com.gjing.project.scala.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author Gjing
 **/
@Repository
trait CustomerRepository extends JpaRepository[Customer, Integer] {
  /**
   * 通过用户名查询
   * @param name 用户名
   * @return Customer
   */
  def findByCustomerName(name:String) : Customer
}
