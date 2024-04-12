package com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetDataReqBody(
    @SerialName("SearchText")
    val searchText: String
)