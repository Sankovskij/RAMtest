package sankovskij.test.ramtest

import android.app.Application
import sankovskij.test.ramtest.common.dagger.AppComponent
import sankovskij.test.ramtest.common.dagger.AppModule
import sankovskij.test.ramtest.common.dagger.DaggerAppComponent

class App : Application() {
    companion object {
        lateinit var instance: App
    }

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

}

