package com.example.ataei.app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class GameApplication : DaggerApplication(){
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        TODO("Not yet implemented")
    }

}