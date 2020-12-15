package sankovskij.test.ramtest.splash.presenter

import android.content.SharedPreferences
import android.os.Handler
import moxy.MvpPresenter
import sankovskij.test.ramtest.splash.SplashView
import javax.inject.Inject


class SplashPresenter(): MvpPresenter<SplashView>() {
    @Inject
    lateinit var sharedPreferences: SharedPreferences


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        initSplashScreen()
    }

    fun initSplashScreen() {
        val splashScreenDuration = splashDuration()

        Handler().postDelayed(
                {

                    val user = sharedPreferences.getString("USER", null)
                    hasUser(user)
                    viewState.finish()
                },
                splashScreenDuration
        )
    }

    private fun splashDuration() = 2000L

    private fun hasUser(user: String?) {
        when {
            user == null -> {
                val editor = sharedPreferences.edit()
                editor.putString("USER", "user")
                viewState.startOnBoarding()
            }
            else -> {
                viewState.startMain()
            }
        }
    }
}
