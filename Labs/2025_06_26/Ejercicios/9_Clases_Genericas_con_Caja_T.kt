
// // 2025-06-26
// // 9. Clases Genéricas con `Caja<T>`
fun main() {
    val packageIntOne = Caja<Int>(928)
    val packageIntTow = Caja<Int>(null)
    val packageString = Caja<String>("More minu packages")

    println("Int Package #1's Content: ${packageIntOne.obtenerContenido() ?: "NOT CONTENT"}")
    println("Int Package #2's Content: ${packageIntTow.obtenerContenido() ?: "NOT CONTENT"}")
    println("String Package's Content: ${packageString.obtenerContenido() ?: "NOT CONTENT"}")
}

class Caja<T>(val contenido: T?) {
    fun obtenerContenido(): T? {
        return contenido
    }
    
    fun estaVacia(): Boolean {
        return contenido === null
    }
}