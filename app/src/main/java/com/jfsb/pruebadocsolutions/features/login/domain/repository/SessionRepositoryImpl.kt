package com.jfsb.pruebadocsolutions.features.login.domain.repository

import com.jfsb.pruebadocsolutions.core.network.FSResult
import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataReq
import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataResp
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.client.SessionClientImpl
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginReq
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginResp
import com.jfsb.pruebadocsolutions.features.login.data.repository.SessionRepository
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.dto.RegisterResp
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model.RegisterReq

class SessionRepositoryImpl(private val sessionClient: SessionClientImpl) : SessionRepository {
    override suspend fun login(loginReq: LoginReq): FSResult<LoginResp> {
        return sessionClient.login(loginReq)
    }

    override suspend fun register(registerReq: RegisterReq): FSResult<RegisterResp> {
        return sessionClient.register(registerReq)
    }

    override suspend fun getData(getDataReq: GetDataReq): FSResult<GetDataResp> {
        return sessionClient.getData(getDataReq)
    }

}