import kotlin.math.*

// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 2. Polimorfismo con Areas
fun main() {
	val figurasGeometricas = listOf<FiguraGeometrica>(Circulo(2.5), Cuadrado(7.0))

    for (figurasGeometrica in figurasGeometricas) {
        val area = figurasGeometrica.calcularArea()
        
        figurasGeometrica.imprimirNombre()
        println("Area: $area")
    }

}

open class FiguraGeometrica(val nombre: String) {

    fun imprimirNombre() {
        println("Soy una figura: [$nombre]")
    }
    
    open fun calcularArea() : Double {
        return 0.0
    }

}

class Circulo(var radio: Double) : FiguraGeometrica("Circulo") {

    override fun calcularArea() : Double {
        return PI * radio.pow(2)
    }

}

class Cuadrado(var lado: Double) : FiguraGeometrica("Cuadrado") {

    override fun calcularArea() : Double {
        return lado * lado
    }

}
