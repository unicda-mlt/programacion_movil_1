
// // 2025-06-26
// // 5. Companion Object para Factory Method
fun main() {
    val validUser = Usuario.crearDesdeEmail("user@gmail.com")
    val invalidUser = Usuario.crearDesdeEmail("usergmail.com")

    println("Valid User's Email: ${validUser?.email}")
    println("Invalid User's Email: ${invalidUser?.email}")
}

class Usuario private constructor(val email: String) {
    companion object {
        fun crearDesdeEmail(email: String): Usuario? {
            if (!email.contains("@")) {
                return null
            }

            return Usuario(email)
        }
    }
}
