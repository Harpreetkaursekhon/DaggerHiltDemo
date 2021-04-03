package com.myapp.socialmedia.myapp.daggerdemo.demo

import android.util.Log
import javax.inject.Inject

class Car @Inject
constructor(private val wheel: Wheel, private val engine: Engine){

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "car is running" )
    }
}