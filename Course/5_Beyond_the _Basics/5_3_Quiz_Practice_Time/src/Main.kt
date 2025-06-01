package book

fun main () {
    val firstBook = Book(title = "The Pragmatic Programmer: Your Journey to Mastery", author = "Andrew Hunt and David Thomas", year = 2019).getTitleAuthor()
    val secondBook = Book(title = "Refactoring: Improving the Design of Existing Code", author = "Martin Fowler", year = 2018).getTitleAuthorYear()

    println("-- Book list --")
    println("1. \"${firstBook.first}\" by ${firstBook.second}")
    println("2. \"${secondBook.first}\" by ${secondBook.second} written in ${secondBook.third}")
}