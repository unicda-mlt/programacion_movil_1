
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 7. Polimorfismo y Smart Casting
fun main() {
	val animales: List<Animal> = listOf(
        Perro("Pucky"),
        Gato("Celeste"),
        Pajaro("Plumitas")
    )

    for (animal in animales) {
        describirComportamiento(animal)
        println("${animal.nombre} dice ${animal.hacerSonido()} y ${animal.moverse()}")
        println()
    }
}

fun describirComportamiento(animal: Animal) {
    when (animal) {
        is Pajaro -> println("Este animal vuela alto.")
        is Perro -> println("Este animal es el mejor amigo del hombre.")
        else -> println("Este animal tiene un comportamiento interesante.")
    }
}

abstract class Animal(val nombre: String) {
    abstract fun hacerSonido() : String
    abstract fun moverse() : String
}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido()  : String {
        return "¡Guau guau!"
    }

    override fun moverse() : String {
        return "corre muy rápido"
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() : String {
        return "¡Miau miau!"
    }

    override fun moverse() : String {
        return "camina con sigilo"
    }
}

class Pajaro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() : String {
        return "¡Pío pío!"
    }

    override fun moverse() : String {
        return "vuela por los aires"
    }
}
