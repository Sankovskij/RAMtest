package sankovskij.test.ramtest.main.presenter

import android.app.ActivityManager
import moxy.MvpPresenter
import sankovskij.test.ramtest.main.MainView


class MainPresenter(): MvpPresenter<MainView>() {

    val mi = ActivityManager.MemoryInfo()

    fun memoryPercentAvail() = mi.availMem / mi.totalMem as Double * 100.0

    fun memoryAvailableMegs() = (mi.availMem / 0x100000L).toDouble()

        //буду менять
    


}