package com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegisterReq(
    @SerialName("Body")
    val registerReqBody: RegisterReqBody
)