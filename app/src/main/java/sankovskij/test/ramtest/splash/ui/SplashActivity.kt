package sankovskij.test.ramtest.splash.ui

import android.content.Intent
import android.os.Bundle
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import sankovskij.test.ramtest.App
import sankovskij.test.ramtest.R
import sankovskij.test.ramtest.main.ui.MainActivity
import sankovskij.test.ramtest.onboarding.ui.OnboardingActivity
import sankovskij.test.ramtest.splash.presenter.SplashPresenter
import sankovskij.test.ramtest.splash.SplashView

class SplashActivity : MvpAppCompatActivity(), SplashView {

    val presenter: SplashPresenter by moxyPresenter {
        SplashPresenter().apply {
            App.instance.appComponent.inject(this)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
        App.instance.appComponent.inject(this)
        presenter.initSplashScreen()
    }



    override fun init() {

    }

    override fun startOnBoarding() {
        val onboardingIntent = Intent(this, OnboardingActivity::class.java)
        this.startActivity(onboardingIntent)
        finish()
    }

    override fun startMain() {
            val mainIntent = Intent(this, MainActivity::class.java)
            this.startActivity(mainIntent)
            finish()
        }
    }

