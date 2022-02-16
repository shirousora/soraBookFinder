package mx.kodemia.sorabookfinder.models

import kotlinx.serialization.Serializable

@Serializable
data class Authors(
    val links: Links
): java.io.Serializable