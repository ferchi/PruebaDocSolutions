package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Metadata(
    @SerialName("GroupName")
    val groupName: String,
    @SerialName("Name")
    val name: String,
    @SerialName("Value")
    val value: String
)