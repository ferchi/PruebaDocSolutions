package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRespBody(
    @SerialName("JWTExpireTimeOfflineMinutes")
    val jWTExpireTimeOfflineMinutes: Int,
    @SerialName("Token")
    val token: String,
    @SerialName("UserLoginData")
    val userLoginData: UserLoginData
)