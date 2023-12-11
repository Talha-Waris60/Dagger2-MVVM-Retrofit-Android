package com.devdroiddev.dagger2_mvvm.di

import com.devdroiddev.dagger2_mvvm.activities.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity) {

    }
}