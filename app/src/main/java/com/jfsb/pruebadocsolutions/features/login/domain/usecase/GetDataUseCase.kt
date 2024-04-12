package com.jfsb.pruebadocsolutions.features.login.domain.usecase

import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataReq
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginReq
import com.jfsb.pruebadocsolutions.features.login.domain.repository.SessionRepositoryImpl
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model.RegisterReq

class GetDataUseCase(private val sessionRepositoryImpl: SessionRepositoryImpl) {
    suspend fun invoke(getDataReq: GetDataReq) = sessionRepositoryImpl.getData(getDataReq)

}