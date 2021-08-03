package com.Mega_App.Food_Delivery_App.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Mega_App.Food_Delivery_App.R
import com.Mega_App.Food_Delivery_App.model.OrderItem

class OrderItemRecyclerAdapter(val context: Context, var itemList: ArrayList<OrderItem>) :
    RecyclerView.Adapter<OrderItemRecyclerAdapter.OrderItemViewHolder>() {
    class OrderItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val dishName : TextView = view.findViewById(R.id.txtDishName)
        val dishPrice : TextView = view.findViewById(R.id.txtDishPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_cart, parent, false)

        return OrderItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: OrderItemViewHolder, position: Int) {
        val dish = itemList[position]
        holder.dishName.text = dish.itemName
        val temp = "₹"+ dish.itemPrice
        holder.dishPrice.text = temp
    }
}