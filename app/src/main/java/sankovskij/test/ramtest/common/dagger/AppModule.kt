package sankovskij.test.ramtest.common.dagger

import dagger.Module
import dagger.Provides
import sankovskij.test.ramtest.App

@Module
class AppModule(val app: App) {

    @Provides
    fun app(): App {
        return app
    }

}