package book

fun main() {
    val libraryBook = Book("1984", "George Orwell")
    libraryBook.readPage()
    libraryBook.readPage()
    libraryBook.readPage()

    val digitalBook = eBook("Brave New World", "Aldous Huxley")
    digitalBook.readPage()
    digitalBook.readPage()
    digitalBook.readPage()

    println("Progress of each book:")
    println("${libraryBook.name}: ${libraryBook.getCurrentPage} pages")
    println("${digitalBook.name}: ${digitalBook.getCurrentPage} pages and ${digitalBook.getCurrentWordCount} words")
}