package com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Role(
    @SerialName("Id")
    val id: Int,
    @SerialName("Name")
    val name: String
)