
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 1. Figuras Geometricas Basicas
fun main() {
	val circulo = Circulo(2.5)
	val cuadrado = Cuadrado(7.0)
    
    circulo.imprimirNombre()
    cuadrado.imprimirNombre()
}

open class FiguraGeometrica(val nombre: String) {

    fun imprimirNombre() {
        println("Soy una figura: [$nombre]")
    }

}

class Circulo(var radio: Double) : FiguraGeometrica("Circulo")

class Cuadrado(var lado: Double) : FiguraGeometrica("Cuadrado")
