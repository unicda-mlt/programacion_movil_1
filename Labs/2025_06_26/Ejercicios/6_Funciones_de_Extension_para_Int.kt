
// // 2025-06-26
// // 6. Funciones de Extensión para `Int`
fun main() {
    val numberOne = 16
    val numberTwo = 33

    println("Is number #1 even or odd?")
    println("Is ${getEvenOrOddString(numberOne)}")

    println()

    println("Is number #2 even or odd?")
    println("Is ${getEvenOrOddString(numberTwo)}")

    println()

    println("Number #1 = ${numberOne}")
    println("Number #1 to square = ${numberOne.cuadrado()}")
}

fun Int.esPar(): Boolean {
    return this % 2 == 0
}

fun Int.cuadrado(): Int {
    return this * this
}

fun getEvenOrOddString(value: Int): String {
    if (value.esPar()) {
        return "even"
    }

    return "odd"
}
