
// // Ejercicios de POO en Kotlin
// // 2025-06-12
// // 3. Jerarquía de Empleados con `init`
fun main() {
	val gerente = Gerente("Alfonso", 45, 75000.0, 38000.0)
    println("Salario Base: [${gerente.salarioBase}]")
    println("Bono: [${gerente.bono}]")
    println("Salario: [${gerente.calcularSalario()}]")
    println()

	val desarrollador = Desarrollador("José", 45, 65000.0, "Kotlin")
    println("Salario Base: [${desarrollador.salarioBase}]")
    println("Salario: [${desarrollador.calcularSalario()}]")
}

open class Empleado(val nombre: String, val edad: Int, val salarioBase: Double) {
    init {
        println("Se ha registrado un nuevo empleado: $nombre")
    }
    
    open fun calcularSalario(): Double {
        return salarioBase
    }
}

class Gerente(nombre: String, edad: Int, salarioBase: Double, val bono: Double) : Empleado(nombre, edad, salarioBase) {
    override fun calcularSalario(): Double {
        return (salarioBase + bono)
    }
}

class Desarrollador(nombre: String, edad: Int, salarioBase: Double, val lenguaje: String) : Empleado(nombre, edad, salarioBase) { }
