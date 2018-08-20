package app.fakharany.com.myandroidinjectorexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityView {
    @Inject
    lateinit var presenter: MainActivityPresenter

    override fun showToast() {
        Toast.makeText(this, "this is a message ", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.printSomeString()

    }
}
