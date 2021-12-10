package com.project.orderservice.productdetails.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Product(
    @Id
    val id: Int,
    val name: String,
    val category: String,
    val price: Int,
)