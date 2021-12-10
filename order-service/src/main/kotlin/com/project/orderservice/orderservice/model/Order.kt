package com.project.orderservice.orderservice.model

data class Order(
    val id: Int,
    val name: String,
    val category: String,
    val price: Int,
    val qty: Int,
    val amount: Int
)