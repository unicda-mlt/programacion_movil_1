
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 4. Constructores Secundarios para `Producto`
fun main() {
	val producto1 = Producto("PR-001", 15.15)
    println("producto1")
    println("Codigo: ${producto1.codigo}")
    println("Precio: ${producto1.precio}")
    println()

    val producto2 = Producto("PR-002")
    println("producto2")
    println("Codigo: ${producto2.codigo}")
    println("Precio: ${producto2.precio}")
    println()

    val producto3 = Producto()
    println("producto3")
    println("Codigo: ${producto3.codigo}")
    println("Precio: ${producto3.precio}")
    println()

    val producto4 = Producto("PR-004", -2.00)
}

class Producto(val codigo: String, val precio: Double) {
    init {
        if (precio < 0.0) {
            throw IllegalArgumentException("El precio no puede ser negativo")
        }
    }

    constructor(codigo: String) : this(codigo, 9.99) { }

    constructor() : this("GEN-001", 9.99) { }
}
