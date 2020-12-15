package sankovskij.test.ramtest.onboarding.ui

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_onboarding.*
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import sankovskij.test.ramtest.App
import sankovskij.test.ramtest.R
import sankovskij.test.ramtest.main.ui.MainActivity
import sankovskij.test.ramtest.onboarding.OnboardingView
import sankovskij.test.ramtest.onboarding.model.OnBoadrdingData
import sankovskij.test.ramtest.onboarding.model.OnboardingScreenRepo
import sankovskij.test.ramtest.onboarding.model.ViewPagerApapter
import sankovskij.test.ramtest.onboarding.presenter.OnboardingPresenter
import sankovskij.test.ramtest.splash.SplashView
import sankovskij.test.ramtest.splash.presenter.SplashPresenter
import javax.inject.Inject

class OnboardingActivity : MvpAppCompatActivity(), OnboardingView {

    @Inject
    lateinit var reno: OnboardingScreenRepo

    val presenter: OnboardingPresenter by moxyPresenter {
        OnboardingPresenter().apply {
            App.instance.appComponent.inject(this)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        App.instance.appComponent.inject(this)
        var position = screen_pager.currentItem
        button.setOnClickListener {
            if (position < reno.screenList.size-1) {
                position++
                screen_pager.currentItem = position
            } else {
               startMain()
            }
        }

    }

    override fun init() {
       screen_pager.adapter =  ViewPagerApapter(this, reno.screenList)
       tabLayout.setupWithViewPager(screen_pager)
    }

    override fun startMain() {
        val mainIntent = Intent(this, MainActivity::class.java)
        this.startActivity(mainIntent)
        finish()
    }



}