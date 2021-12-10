package com.project.orderservice.orderservice.controller

import com.project.orderservice.orderservice.model.Order
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@FeignClient(name="product-details")
interface ProxyController {

    @GetMapping("/product/{id}")
    fun getProductById(@PathVariable id: Int): Order

}