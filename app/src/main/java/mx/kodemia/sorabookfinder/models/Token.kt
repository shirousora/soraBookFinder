package mx.kodemia.sorabookfinder.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Token(
    @SerialName("plain-text-token")
    val token: String
)