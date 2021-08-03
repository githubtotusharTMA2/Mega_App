package com.Mega_App.Food_Delivery_App.model

data class Order (
    val restaurantName : String,
    val orderDate: String,
    val itemList : ArrayList<OrderItem>
)