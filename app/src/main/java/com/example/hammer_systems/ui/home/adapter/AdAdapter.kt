package com.example.hammer_systems.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hammer_systems.R
import com.example.hammer_systems.databinding.ItemAdBinding
import com.example.hammer_systems.model.Ad

class AdAdapter(): RecyclerView.Adapter<AdAdapter.AdViewHolder>() {
    var ads = ArrayList<Ad>()

    inner class AdViewHolder(val binding: ItemAdBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdViewHolder {
        val binding = ItemAdBinding.inflate(LayoutInflater.from(parent.context))
        return AdViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(R.drawable.ad)
            .into(holder.binding.adImage)
    }

    override fun getItemCount(): Int {
        return ads.size
    }

    fun setData(newData: ArrayList<Ad>){
        ads = newData
        notifyDataSetChanged()
    }

}