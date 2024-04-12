package com.jfsb.pruebadocsolutions.features.login.domain.usecase

import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginReq
import com.jfsb.pruebadocsolutions.features.login.domain.repository.SessionRepositoryImpl

class LoginUseCase(private val sessionRepositoryImpl: SessionRepositoryImpl) {
    suspend fun invoke(loginReq: LoginReq) = sessionRepositoryImpl.login(loginReq)

}