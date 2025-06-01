package book
import kotlin.random.Random


fun main () {
    val clients = listOf("Máximo", "Felipe")
    val countBorrowedBookByClients = mutableMapOf<String, Int>()

    for (client in clients) {
        val countBorrowedBooks = Random.nextInt(1, 20 + 1)
        countBorrowedBookByClients.put(client, countBorrowedBooks)
    }

    val books = listOf(
        Book(title = "The Pragmatic Programmer: Your Journey to Mastery", author = "Andrew Hunt and David Thomas", year = 2019),
        Book(title = "Refactoring: Improving the Design of Existing Code", author = "Martin Fowler", year = 2018),
        Book(title = "You Don't Know JS Yet: Scope & Closures", author = "Kyle Simpson", year = 2020),
        Book(title = "Introduction to the Theory of Computation", author = "Michael Sipser", year = 2012)
    )

    println("-- Book List --")
    books.forEach { it.printUrl() }
    println()

    for (client in clients) {
        val selectedBook = Random.nextInt(0, books.size)
        val book = books[selectedBook]
        val countBorrowedBooks = countBorrowedBookByClients[client]

        println("$client has $countBorrowedBooks borrowed books. Could $client borrow \"${book.title}\"?")
        println(if (book.canBorrow(countBorrowedBooks!!)) "Yes" else "No")

        println()
    }
}