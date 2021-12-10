package com.project.orderservice.productdetails.controllers

import com.project.orderservice.productdetails.models.Product
import com.project.orderservice.productdetails.repositories.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class Controller (val productRepo: ProductRepository) {

    @GetMapping("/product")
    fun getAllProduct(@RequestParam(required = false) category: String? = null): MutableList<Product> {
        if(category != null) {
            return productRepo.findByCategory(category)
        }
        return productRepo.findAll()
    }

    @GetMapping("/product/{id}")
    fun getProductById(@PathVariable id: Int): Optional<Product> {
        return productRepo.findById(id)
    }
}