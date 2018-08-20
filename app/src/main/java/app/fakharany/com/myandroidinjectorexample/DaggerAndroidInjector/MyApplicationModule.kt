package app.fakharany.com.myandroidinjectorexample.DaggerAndroidInjector

import app.fakharany.com.myandroidinjectorexample.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MyApplicationModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun provideMainActivity(): MainActivity
}