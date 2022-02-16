package mx.kodemia.sorabookfinder.models

import kotlinx.serialization.Serializable

@Serializable
data class BookData(
    val data: MutableList<Libro>
): java.io.Serializable