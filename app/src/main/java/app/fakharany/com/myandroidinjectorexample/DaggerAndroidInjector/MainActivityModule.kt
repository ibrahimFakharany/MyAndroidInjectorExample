package app.fakharany.com.myandroidinjectorexample.DaggerAndroidInjector

import android.content.Context
import app.fakharany.com.myandroidinjectorexample.MainActivity
import app.fakharany.com.myandroidinjectorexample.MainActivityPresenter
import app.fakharany.com.myandroidinjectorexample.MainActivityView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun provideMainActivityView(): MainActivityView {
        return MainActivity()
    }
}