
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 6. Herencia y Llamadas a `super`
fun main() {
	val coche = Coche()
    coche.describir()
}

open class Vehiculo {
    open fun describir() {
        println("Este es un vehículo genérico.")
    }
}

class Coche : Vehiculo() {
    override fun describir() {
        super.describir()
        println("Más específicamente, un coche de 4 ruedas.")
    }
}
