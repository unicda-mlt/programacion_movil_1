
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 5. Clases Abstractas - `Animal`
fun main() {
	val animales: List<Animal> = listOf(
        Perro("Pucky"),
        Gato("Celeste"),
        Pajaro("Plumitas")
    )

    for (animal in animales) {
        println("${animal.nombre} dice ${animal.hacerSonido()} y ${animal.moverse()}")
        println()
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
