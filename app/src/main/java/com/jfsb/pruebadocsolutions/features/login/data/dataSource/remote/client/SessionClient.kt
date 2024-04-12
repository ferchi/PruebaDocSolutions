package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.client

import com.jfsb.pruebadocsolutions.core.network.FSResult
import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataReq
import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataResp
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginReq
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginResp
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.dto.RegisterResp
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model.RegisterReq

interface SessionClient {
    suspend fun login(loginReq: LoginReq): FSResult<LoginResp>
    suspend fun register(registerReq: RegisterReq): FSResult<RegisterResp>
    suspend fun getData(getDataReq: GetDataReq) : FSResult<GetDataResp>

}