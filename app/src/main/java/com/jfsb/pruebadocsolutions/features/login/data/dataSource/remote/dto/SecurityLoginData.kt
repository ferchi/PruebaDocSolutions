package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SecurityLoginData(
    @SerialName("Applications")
    val applications: List<Application>,
    @SerialName("Roles")
    val roles: List<Role>
)