package com.jfsb.pruebadocsolutions.core.di

import android.app.Application
import com.jfsb.pruebadocsolutions.core.utils.AppLifecycleObserver
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DocApp: Application() {
    private val id = "DocApp"
    val lifecycle = AppLifecycleObserver()

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(lifecycle)

        startKoin {
            androidLogger()
            androidContext(this@DocApp)
            modules(androidModule() + appModule())
        }
    }
}