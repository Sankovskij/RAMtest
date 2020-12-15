package sankovskij.test.ramtest.onboarding

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface OnboardingView : MvpView {
    fun init()
    fun startMain()
}
