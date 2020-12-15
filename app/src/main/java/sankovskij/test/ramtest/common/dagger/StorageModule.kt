package sankovskij.test.ramtest.common.dagger

import android.app.Activity
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import sankovskij.test.ramtest.App
import sankovskij.test.ramtest.onboarding.model.OnboardingScreenRepo
import javax.inject.Singleton


@Module
class StorageModule() {
    @Singleton
    @Provides
    fun SharedPrefences(app: App): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences (app)
    }

    @Singleton
    @Provides
    fun OnboardingScreenRepoProvide() : OnboardingScreenRepo {
        return OnboardingScreenRepo()
    }



}