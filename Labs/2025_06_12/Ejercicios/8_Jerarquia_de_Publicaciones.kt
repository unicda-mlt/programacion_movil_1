
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 8. Jerarquía de Publicaciones
fun main() {
	val libro = Libro("Código limpio", "Robert C. Martin", 464)

	val articulo = ArticuloDeRevista(
        "Learning to enumerate shifts for large-scale flexible personnel scheduling problems",
        "Farin Rastgar-Amini, Guy Desaulniers & Maxime Gasse",
        " Springer Nature Link"
    )

    println("-- Libro --")
    println("Título: ${libro.titulo}")
    println("Autor(es): ${libro.autor}")
    println("Número de páginas: ${libro.numeroPaginas}")

    println()
    
    println("-- Artículo de Revista --")
    println("Título: ${articulo.titulo}")
    println("Autor(es): ${articulo.autor}")
    println("Revista: ${articulo.nombreRevista}")
}

open class Publicacion(val titulo: String, val autor: String)

class Libro(titulo: String, autor: String, val numeroPaginas: Int) : Publicacion(titulo, autor)

class ArticuloDeRevista(titulo: String, autor: String, val nombreRevista: String) : Publicacion(titulo, autor)
