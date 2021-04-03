package com.myapp.socialmedia.myapp.daggerdemo.demo

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import javax.inject.Inject
import javax.inject.Singleton

interface Name{
    fun getName()
}

class  ImplementName  @Inject constructor(val name: String): Name{
    override fun getName() {
        Log.d("main", "Name is $name")
    }
}
class Main @Inject constructor(private val name: Name){
    fun getName(){
        name.getName()
    }
}

/*
//way1. interface injection using Module and @Binds
@Module
@InstallIn(ActivityComponent::class)
abstract class Module{

    @Binds
    @Singleton
    abstract fun binding(implementName: ImplementName): Name

}
 */

//way2. to provide dependency of interface
@Module
@InstallIn(ActivityComponent::class)
 class Module {

    @Provides
    @Singleton
    fun getMyName():String = "Preeti"

     @Provides
     @Singleton
     fun binding(name: String): Name = ImplementName(name)

 }