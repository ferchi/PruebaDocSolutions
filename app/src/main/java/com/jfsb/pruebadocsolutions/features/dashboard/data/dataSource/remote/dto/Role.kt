package com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Role(
    @SerialName("Id")
    val id: Int,
    @SerialName("Name")
    val name: String
)