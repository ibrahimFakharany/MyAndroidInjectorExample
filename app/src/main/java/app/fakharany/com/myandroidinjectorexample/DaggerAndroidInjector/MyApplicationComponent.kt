package app.fakharany.com.myandroidinjectorexample.DaggerAndroidInjector

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector


@Component(modules = [AndroidInjectionModule::class, MyApplicationModule::class])
interface MyApplicationComponent
    : AndroidInjector<MyApplication>