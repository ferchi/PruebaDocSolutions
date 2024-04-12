package com.jfsb.pruebadocsolutions.core.di

import org.koin.core.context.startKoin

fun initKoin() = startKoin{
    modules(
        remoteModule,
        useCaseModule
    )
}