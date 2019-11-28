package com.gjing.project.scala.repository

import java.util.Optional

import com.gjing.project.scala.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author Gjing
 **/
@Repository
trait CustomerRepository extends JpaRepository[Customer, Integer] {
  def findByCustomerName(name:String) : Customer
}
