package com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetDataResp(
    @SerialName("Body")
    val getDataRespBody: List<GetDataRespBody>,
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