package edu.iesam.loginexam1eval.app

import android.app.Application
import edu.iesam.loginexam1eval.app.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class LoginExamApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@LoginExamApp)
            modules(AppModule().module)
        }
    }
}