package com.example.hammer_systems.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.hammer_systems.data.prefs.Prefs
import com.example.hammer_systems.core.BaseViewModel
import com.example.hammer_systems.data.cloud.ResultWrapper
import com.example.hammer_systems.data.cloud.repository.BaseCloudRepository
import com.example.hammer_systems.model.Ad
import com.example.hammer_systems.model.Food
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val baseCloudRepository: BaseCloudRepository,
    val prefs: Prefs
) : BaseViewModel() {
    val foods = MutableLiveData(ArrayList<Food>())
    val ads = MutableLiveData(ArrayList<Ad>())
    val TAG = javaClass.simpleName


    fun getFoods(){
        launchIO {
            val wrapper = baseCloudRepository.getFoods()

            when (wrapper){
                is ResultWrapper.Success ->{
                    Log.i(TAG, "getFoods: ${wrapper.value}")
                    val a = ArrayList<Food>(wrapper.value.Result.subList(0,5))
                    foods.postValue(a)
                }
                is ResultWrapper.Error ->{
                    Log.i(TAG, "getFoods: ${wrapper.error}")
                }
            }
        }
    }


    fun getAds(){
        launchIO {
            val adss = ArrayList<Ad>()
            adss.add(Ad(0,"asd","asd"))
            adss.add(Ad(1,"asd","asd"))
            adss.add(Ad(2,"asd","asd"))
            adss.add(Ad(3,"asd","asd"))
            ads.postValue(adss)
        }
    }


}