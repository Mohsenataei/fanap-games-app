package com.example.ataei.di.module

import android.app.Application
import android.content.Context
import com.example.ataei.app.GameApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


//@Module(includes = [ViewModelBuiler])
object AppModule {

    @Provides
    @Singleton
    fun provideContext(app: GameApplication): Context = app


}