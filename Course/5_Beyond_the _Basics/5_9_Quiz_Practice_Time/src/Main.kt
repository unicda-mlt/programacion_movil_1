import book.Book
import animal.Puppy
import kotlin.random.Random
import kotlin.random.nextInt

fun main () {
    val books = listOf(
        Book(title = "The Pragmatic Programmer: Your Journey to Mastery", author = "Andrew Hunt and David Thomas", year = 2019, pages = 352),
        Book(title = "Refactoring: Improving the Design of Existing Code", author = "Martin Fowler", year = 2018, pages = 448),
        Book(title = "You Don't Know JS Yet: Scope & Closures", author = "Kyle Simpson", year = 2020, pages = 279),
        Book(title = "Introduction to the Theory of Computation", author = "Michael Sipser", year = 2012, pages = 504)
    )
    val puppy = Puppy("Mariachi")
    val selectedBook = books[Random.nextInt(0, books.size)]

    println("Oh no! my puppy ${puppy.name}, grabbed the \"${selectedBook.title}\" from the library stand. We need to catch him before he eats all the pages!")

    println()
    println("Book's initial page count: ${selectedBook.pages}")
    println()

    for (hour in 1..Random.nextInt(12, 15)) {
        puppy.playWithBook(selectedBook)

        println("Hour $hour trying to catch the puppy.")
        println("Book's current page count: ${selectedBook.pages}")
        println()
    }

    println("We have caught ${puppy.name}, but unfortunately all the book's pages are torn")
}