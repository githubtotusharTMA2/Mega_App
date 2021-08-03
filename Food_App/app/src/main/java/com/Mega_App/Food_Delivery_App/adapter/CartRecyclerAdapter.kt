package com.Mega_App.Food_Delivery_App.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Mega_App.Food_Delivery_App.R
import com.Mega_App.Food_Delivery_App.model.Dish

class CartRecyclerAdapter(val context: Context, var orderList: ArrayList<Dish>): RecyclerView.Adapter<CartRecyclerAdapter.CartViewHolder>() {
    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val dishName : TextView = view.findViewById(R.id.txtDishName)
        val dishPrice : TextView = view.findViewById(R.id.txtDishPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_cart, parent,false)
        return CartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return orderList.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val dish = orderList[position]
        holder.dishName.text = dish.dishName
        val temp = "₹"+ dish.dishPrice
        holder.dishPrice.text = temp
    }
}