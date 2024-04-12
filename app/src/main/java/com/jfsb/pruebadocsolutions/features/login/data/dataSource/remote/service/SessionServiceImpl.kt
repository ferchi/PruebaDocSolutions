package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.service

import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataReq
import com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto.GetDataResp
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginReq
import com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto.LoginResp
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.dto.RegisterResp
import com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model.RegisterReq
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType

class SessionServiceImpl (private val httpClient: HttpClient): SessionService{
    override suspend fun login(loginReq: LoginReq): LoginResp {
        val response = httpClient.post("https://techhub.docsolutions.com/OnBoardingPre/WebApi/api/authentication/authentication") {
            contentType(ContentType("application", "json"))
            setBody(loginReq)
        }
        return response.body()!!
    }

    override suspend fun register(registerReq: RegisterReq): RegisterResp {
        val response = httpClient.post("https://techhub.docsolutions.com/OnBoardingPre/WebApi/api/user/RegisterUserRole") {
            contentType(ContentType.Application.Json)
            setBody(registerReq)
        }
        return response.body()!!
    }

    override suspend fun getData(getDataReq: GetDataReq): GetDataResp {
        val response = httpClient.post("https://techhub.docsolutions.com/OnBoardingPre/WebApi/api/user/GetUsers") {
            contentType(ContentType.Application.Json)
            setBody(getDataReq)
        }
        return response.body()!!
    }

}