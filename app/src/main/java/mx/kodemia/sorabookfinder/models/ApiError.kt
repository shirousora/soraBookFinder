package mx.kodemia.sorabookfinder.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiError(
    val errors: ArrayList<ApiErrorDetail>
)