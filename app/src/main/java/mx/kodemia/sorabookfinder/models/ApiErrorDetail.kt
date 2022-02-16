package mx.kodemia.sorabookfinder.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiErrorDetail(
    val status: String,
    val title: String,
    val detail: String
)