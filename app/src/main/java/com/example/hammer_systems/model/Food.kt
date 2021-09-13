package com.example.hammer_systems.model

import com.google.gson.annotations.SerializedName

data class Food(

    @SerializedName("_id")
    val id: String,

    val menuname: String,

    val description: String,

    val image_link: String,

    val images: ArrayList<String>,

    @SerializedName("__v")
    val price: Int
)


data class ResponseResult(
    val Total_Menu: Int,
    val Result: ArrayList<Food>
)