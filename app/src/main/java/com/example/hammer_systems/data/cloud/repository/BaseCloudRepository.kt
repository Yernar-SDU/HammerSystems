package com.example.hammer_systems.data.cloud.repository

import com.example.hammer_systems.data.cloud.ResultWrapper
import com.example.hammer_systems.model.ResponseResult


interface BaseCloudRepository{

    suspend fun getFoods(): ResultWrapper<ResponseResult>

}