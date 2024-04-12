package com.jfsb.pruebadocsolutions.core.di

import com.jfsb.pruebadocsolutions.features.login.domain.usecase.GetDataUseCase
import com.jfsb.pruebadocsolutions.features.login.domain.usecase.LoginUseCase
import com.jfsb.pruebadocsolutions.features.login.domain.usecase.RegisterUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { LoginUseCase(get()) }
    single { RegisterUseCase(get()) }
    single { GetDataUseCase(get()) }

}