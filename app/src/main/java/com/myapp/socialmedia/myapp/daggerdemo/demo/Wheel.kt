package com.myapp.socialmedia.myapp.daggerdemo.demo

import android.util.Log
import javax.inject.Inject

class Wheel {

    @Inject
    constructor()
    fun getWheel(){
        Log.d("main", "wheel started")
    }
}