
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 9. Constructores y Validación en Cadena
fun main() {
	val usuario1 = Usuario("juan", "juan@gmail.com")
    println("usuario1")
    println("username: ${usuario1.username}")
    println("email: ${usuario1.email}")

    println()
    
    val usuario2 = Usuario("Ana")
    println("usuario2")
    println("username: ${usuario2.username}")
    println("email: ${usuario2.email}")
}

class Usuario(val username: String, val email: String) {
    init {
        if (username.isBlank()) {
			throw IllegalArgumentException("El username no puede estar vacío.")
        }
    }

	constructor(username: String) : this(username, "$username@empresa.com") {
        if (!email.contains("@")) {
            throw IllegalArgumentException("El email generado no es válido.")
        }
    }
}
