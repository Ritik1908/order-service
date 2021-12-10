package com.project.orderservice.orderservice.controller

import com.project.orderservice.orderservice.model.Order
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(val proxy: ProxyController) {

    @GetMapping("/order")
    fun putOrder(@RequestParam id: Int, @RequestParam qty: Int): Order {
        val order: Order = proxy.getProductById(id)
        return Order(id, order.name, order.category, order.price, qty, (qty * order.price))
    }

}