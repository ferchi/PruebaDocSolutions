package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Function(
    @SerialName("Id")
    val id: Int,
    @SerialName("Name")
    val name: String
)