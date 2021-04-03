package com.myapp.socialmedia.myapp.daggerdemo.demo

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()
    fun getEngine(){
        Log.d("main", "engine started")
    }
}