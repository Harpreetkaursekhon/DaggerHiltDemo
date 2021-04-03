package com.myapp.socialmedia.myapp.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.socialmedia.myapp.daggerdemo.demo.Car
import com.myapp.socialmedia.myapp.daggerdemo.demo.Main
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    lateinit var main: Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCar()
        main.getName()
    }
}