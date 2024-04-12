package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.client

import com.jfsb.pruebadocsolutions.core.network.FSResult
import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataReq
import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataResp
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginReq
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginResp
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.service.SessionServiceImpl
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.dto.RegisterResp
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model.RegisterReq
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SessionClientImpl(private val sessionServiceImpl: SessionServiceImpl) : SessionClient{
    override suspend fun login(loginReq: LoginReq): FSResult<LoginResp> {
        return withContext(Dispatchers.Default) {
            try {
                val response = sessionServiceImpl.login(loginReq)
                FSResult.Success(response)
            } catch (e: Exception) {
                FSResult.Error(e.message?.let { Exception(it) } ?: Exception("Error"))
            }
        }
    }

    override suspend fun register(registerReq: RegisterReq): FSResult<RegisterResp> {
        return withContext(Dispatchers.Default) {
            try {
                val response = sessionServiceImpl.register(registerReq)
                FSResult.Success(response)
            } catch (e: Exception) {
                FSResult.Error(e.message?.let { Exception(it) } ?: Exception("Error"))
            }
        }
    }

    override suspend fun getData(getDataReq: GetDataReq): FSResult<GetDataResp> {
        return withContext(Dispatchers.Default) {
            try {
                val response = sessionServiceImpl.getData(getDataReq)
                FSResult.Success(response)
            } catch (e: Exception) {
                FSResult.Error(e.message?.let { Exception(it) } ?: Exception("Error"))
            }
        }
    }
}