package sankovskij.test.ramtest.common.dagger

import dagger.Component
import sankovskij.test.ramtest.main.ui.MainActivity
import sankovskij.test.ramtest.main.presenter.MainPresenter
import sankovskij.test.ramtest.onboarding.presenter.OnboardingPresenter
import sankovskij.test.ramtest.onboarding.ui.OnboardingActivity
import sankovskij.test.ramtest.splash.ui.SplashActivity
import sankovskij.test.ramtest.splash.presenter.SplashPresenter
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        StorageModule::class
    ]
)

interface AppComponent {
    fun inject(splashPresenter: SplashPresenter)
    fun inject(splashActivity: SplashActivity)
    fun inject(mainActivity: MainActivity)
    fun inject(mainPresenter: MainPresenter)
    fun inject(onboardingPresenter: OnboardingPresenter)
    fun inject(onboardingActivity: OnboardingActivity)




}
