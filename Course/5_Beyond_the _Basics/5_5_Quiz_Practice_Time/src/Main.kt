
fun main () {
    println("-- Library --")

    val allBooks = setOf("Clean Code", "Clean Architecture", "Agile Software Development")
    val library = mapOf("Robert C. Martin" to allBooks)

    println("Is there ${allBooks.elementAt(2)} book written by ${library.keys.first()}?")
    println(library.any { it.value.contains("Clean Architecture") })

    val moreBooks = mutableMapOf<String, Set<String>>()
    moreBooks.getOrPut("Martin Fowler") { setOf("Refactoring: Improving the Design of Existing Code", "Patterns of Enterprise Application Architecture") }
    moreBooks.getOrPut("Steve McConnell") { setOf("Rapid Development") }

    println("\nGive me a list of additional authors")

    for (book in moreBooks) {
        println(book)
    }
}