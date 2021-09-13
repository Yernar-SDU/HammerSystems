package com.example.hammer_systems.data.cloud.rest

import com.example.hammer_systems.model.ResponseResult
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("menu")
    suspend fun getFoods(): ResponseResult



}