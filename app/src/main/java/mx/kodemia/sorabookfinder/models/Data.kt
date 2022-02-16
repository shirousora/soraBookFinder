package mx.kodemia.sorabookfinder.models

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val type: String,
    val id: String
): java.io.Serializable