package app.fakharany.com.myandroidinjectorexample

import javax.inject.Inject

class MainActivityPresenter @Inject constructor(var mView: MainActivityView) {
    fun printSomeString() {
        mView.showToast()
    }
}