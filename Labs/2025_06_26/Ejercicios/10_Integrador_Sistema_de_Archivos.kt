
// // 2025-06-26
// // 10. Integrador - Sistema de Archivos
fun main() {
    val root = GestorArchivos.crearDirectorio("Raíz")

    val fileOne = GestorArchivos.crearArchivo("Boog.pdf", 120)
    val fileTwo = GestorArchivos.crearArchivo("Picture.jpg", 300)

    root.contenidos.add(fileOne)
    root.contenidos.add(fileTwo)
    
    val subDir = GestorArchivos.crearDirectorio("Documents")
    val fileThree = GestorArchivos.crearArchivo("Thesis.docx", 500)

    subDir.contenidos.add(fileThree)
    root.contenidos.add(subDir)

    println("Total size directory's storage '${root.nombre}': ${root.calcularTamañoTotal()} KB")
}

sealed class ElementoSistema(open val nombre: String)

data class Archivo(
    override val nombre: String,
    val tamañoKB: Int
) : ElementoSistema(nombre)

data class Directorio(
    override val nombre: String,
    val contenidos: MutableList<ElementoSistema> = mutableListOf()
) : ElementoSistema(nombre)

object GestorArchivos {
    fun crearArchivo(nombre: String, tamañoKB: Int): Archivo {
        return Archivo(nombre, tamañoKB)
    }

    fun crearDirectorio(nombre: String): Directorio {
        return Directorio(nombre)
    }
}

fun Directorio.calcularTamañoTotal(): Int {
    return contenidos.sumOf { elemento ->
        when (elemento) {
            is Archivo -> elemento.tamañoKB
            is Directorio -> elemento.calcularTamañoTotal()
        }
    }
}