package com.jfsb.pruebadocsolutions.features.dashboard.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetDataRespBody(
    @SerialName("Active")
    val active: Boolean,
    @SerialName("CreationDate")
    val creationDate: String,
    @SerialName("Email")
    val email: String?,
    @SerialName("FatherLastName")
    val fatherLastName: String,
    @SerialName("Id")
    val id: Int,
    @SerialName("Locked")
    val locked: Boolean,
    @SerialName("Metadata")
    val metadata: List<String>?,
    @SerialName("MotherLastName")
    val motherLastName: String,
    @SerialName("Name")
    val name: String,
    @SerialName("Password")
    val password: String?,
    @SerialName("PhoneNumber")
    val phoneNumber: String?,
    @SerialName("Roles")
    val roles: List<Role>,
    @SerialName("Tenant_Id")
    val tenantId: String?,
    @SerialName("Username")
    val username: String
)