package com.jfsb.pruebadocsolutions.core.network

sealed class FSResult<out T>{
    data class Success<out T>(val dataResponse: T): FSResult<T>()
    data class Error(val status: Exception): FSResult<Nothing>()

    fun isSuccessful() = this is Success<T>
    fun isError() = this is Error

    fun getData(): T? = if (this is Success) dataResponse else null
    fun getException(): Exception? = if (this is Error) status else null
}
