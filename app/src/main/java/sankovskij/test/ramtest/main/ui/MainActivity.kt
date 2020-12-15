package sankovskij.test.ramtest.main.ui

import android.os.Bundle
import moxy.MvpAppCompatActivity
import sankovskij.test.ramtest.R
import sankovskij.test.ramtest.main.MainView

class MainActivity : MvpAppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}