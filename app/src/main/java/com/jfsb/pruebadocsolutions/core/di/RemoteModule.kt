package com.jfsb.pruebadocsolutions.core.di

import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.client.SessionClientImpl
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.service.SessionServiceImpl
import com.jfsb.pruebadocsolutions.features.login.domain.repository.SessionRepositoryImpl
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val remoteModule = module {
    single {
        HttpClient(){
            install(ContentNegotiation){
                json(Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                    prettyPrint = true
                    encodeDefaults = true
                    serializersModule = Json {ignoreUnknownKeys = true}.serializersModule
                })
            }

            install(Logging){
                logger = Logger.SIMPLE
                level = LogLevel.ALL
            }

            install(ResponseObserver){
                onResponse { response ->
                    println("HTTP status: ${response.status.value}")
                }
            }

            expectSuccess = false

            install(HttpTimeout){
                requestTimeoutMillis = 15000
                connectTimeoutMillis = 15000
                socketTimeoutMillis = 15000
            }
        }
    }

    single { SessionServiceImpl(get()) }
    single { SessionClientImpl(get()) }
    single { SessionRepositoryImpl(get()) }
}