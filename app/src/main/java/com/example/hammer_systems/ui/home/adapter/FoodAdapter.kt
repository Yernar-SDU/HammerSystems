package com.example.hammer_systems.ui.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hammer_systems.R
import com.example.hammer_systems.databinding.ItemFoodBinding
import com.example.hammer_systems.model.Food

class FoodAdapter(): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    var foods = ArrayList<Food>()

    inner class FoodViewHolder(val binding: ItemFoodBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context))
        return FoodViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.binding.foodName.text = foods[position].menuname
        holder.binding.foodCharacteristics.text = foods[position].description
        holder.binding.foodButton.text = "от ${foods[position].price} руб"
        Glide.with(holder.itemView.context)
            .load(foods[position].images[0].toString())
            .into(holder.binding.foodImage)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

    fun setData(newData: ArrayList<Food>){
        foods = newData
        notifyDataSetChanged()
    }

}