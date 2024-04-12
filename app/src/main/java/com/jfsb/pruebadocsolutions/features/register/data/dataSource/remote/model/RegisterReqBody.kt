package com.jfsb.pruebadocsolutions.features.register.data.dataSource.remote.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegisterReqBody(
    @SerialName("Email")
    val email: String,
    @SerialName("FatherLastName")
    val fatherLastName: String,
    @SerialName("Metadata")
    val metadata: String?,
    @SerialName("MotherLastName")
    val motherLastName: String,
    @SerialName("Name")
    val name: String,
    @SerialName("Password")
    val password: String,
    @SerialName("PhoneNumber")
    val phoneNumber: String,
    @SerialName("Roles")
    val roles: List<Role>,
    @SerialName("Tenant")
    val tenant: String?,
    @SerialName("UserName")
    val userName: String
)