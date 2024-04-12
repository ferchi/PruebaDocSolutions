package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResp(
    @SerialName("Body")
    val loginRespBody: LoginRespBody,
    @SerialName("EncryptedBody")
    val encryptedBody: String?,
    @SerialName("IsOK")
    val isOK: Boolean,
    @SerialName("Messages")
    val messages: String?,
    @SerialName("ResponseCode")
    val responseCode: Int,
    @SerialName("SecurityData")
    val securityData: String?,
    @SerialName("TransactionId")
    val transactionId: String
)