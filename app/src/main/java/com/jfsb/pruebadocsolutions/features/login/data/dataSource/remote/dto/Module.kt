package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Module(
    @SerialName("Functions")
    val functions: List<Function>,
    @SerialName("Id")
    val id: Int,
    @SerialName("Name")
    val name: String
)