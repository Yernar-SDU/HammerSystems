package com.example.hammer_systems.data.prefs

import android.content.SharedPreferences
import com.google.gson.Gson
import javax.inject.Inject

class PrefsImpl @Inject constructor(
    private val gson: Gson,
    private val preferences: SharedPreferences
) : Prefs {

//    override fun isLoggedIn(): Boolean {
//        return preferences.getBoolean("loggedIn", false)
//    }
//
//    override fun login() {
//        val editor = preferences.edit()
//        editor.putBoolean("loggedIn", true)
//    }

}