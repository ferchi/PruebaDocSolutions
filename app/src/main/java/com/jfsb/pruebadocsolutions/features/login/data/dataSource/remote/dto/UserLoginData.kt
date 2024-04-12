package com.jfsb.pruebadocsolutions.features.login.data.dataSource.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserLoginData(
    @SerialName("CurrentFileId")
    val currentFileId: Int,
    @SerialName("Email")
    val email: String,
    @SerialName("FatherLastName")
    val fatherLastName: String,
    @SerialName("Id")
    val id: Int,
    @SerialName("Metadata")
    val metadata: List<Metadata>,
    @SerialName("MotherLastName")
    val motherLastName: String,
    @SerialName("Name")
    val name: String,
    @SerialName("PhoneNumber")
    val phoneNumber: String,
    @SerialName("SecurityLoginData")
    val securityLoginData: SecurityLoginData,
    @SerialName("Username")
    val username: String
)