package com.juned.templatestaterproject

import android.app.Application
import com.juned.templatestarterproject.core.di.databaseModule
import com.juned.templatestarterproject.core.di.networkModule
import com.juned.templatestarterproject.core.di.repositoryModule
import com.juned.templatestarterproject.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    viewModelModule
                )
            )
        }

    }

}