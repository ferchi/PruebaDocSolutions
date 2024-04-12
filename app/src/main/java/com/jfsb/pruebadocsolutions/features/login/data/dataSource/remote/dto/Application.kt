package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Application(
    @SerialName("Id")
    val id: Int,
    @SerialName("Modules")
    val modules: List<Module>,
    @SerialName("Name")
    val name: String
)