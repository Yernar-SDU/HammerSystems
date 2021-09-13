package com.example.hammer_systems.data.cloud.repository

import com.example.hammer_systems.data.cloud.ResultWrapper
import com.example.hammer_systems.data.cloud.rest.ApiService
import com.example.hammer_systems.data.cloud.safeApiCall
import com.example.hammer_systems.model.ResponseResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class CloudRepository(
    private val api: ApiService,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
): BaseCloudRepository {
    override suspend fun getFoods(): ResultWrapper<ResponseResult> {
        return safeApiCall(dispatcher){
            api.getFoods()
        }
    }


}