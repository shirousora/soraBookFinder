package mx.kodemia.sorabookfinder.models

import mx.kodemia.sorabookfinder.R
import kotlinx.serialization.Serializable

@Serializable
data class Libro(
    val imagen: Int = R.drawable.libro_1,
    val titulo: String = "Título",
    val autor: String = "Autor",
    val categoria: String = "Categoría",
    val attributes: Attributes,
    val relationships: Relationships,
    val links: Links
): java.io.Serializable
