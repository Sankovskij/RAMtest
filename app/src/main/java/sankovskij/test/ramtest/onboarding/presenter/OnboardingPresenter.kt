package sankovskij.test.ramtest.onboarding.presenter

import android.content.SharedPreferences
import android.os.Handler
import moxy.MvpPresenter
import sankovskij.test.ramtest.onboarding.OnboardingView
import sankovskij.test.ramtest.splash.SplashView
import javax.inject.Inject


class OnboardingPresenter(): MvpPresenter<OnboardingView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()
    }


//будем менять сейчас

}

