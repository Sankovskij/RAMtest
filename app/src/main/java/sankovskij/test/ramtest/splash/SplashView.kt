package sankovskij.test.ramtest.splash

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface SplashView : MvpView {
    fun init()
    fun finish()
    fun startOnBoarding()
    fun startMain()
}
