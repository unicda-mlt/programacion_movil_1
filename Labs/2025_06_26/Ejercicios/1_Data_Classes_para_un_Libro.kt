
// // 2025-06-26
// // 1. Data Classes para un `Libro`
fun main() {
  val bookOne = Libro(
        titulo = "Effective Java",
        autor = "Joshua Bloch",
        isbn = "9780134685991"
    )

    val bookTwo = Libro(
        titulo = "Effective Java",
        autor = "Joshua Bloch",
        isbn = "9780134685991"
    )

    if (bookOne == bookTwo) {
        println("Book #1 and Book #2 are equal")
    }

    println("Libro One: ${bookOne.toString()}")

    val bookThree = bookOne.copy(titulo = "Title changed")

    println("Book #3: ${bookThree.toString()}")
}

data class Libro(var titulo: String, var autor: String, var isbn: String)
