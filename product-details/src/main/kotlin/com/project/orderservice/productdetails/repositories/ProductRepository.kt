package com.project.orderservice.productdetails.repositories

import com.project.orderservice.productdetails.models.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Int> {
    fun findByCategory(category: String): MutableList<Product>
}