package animal

import book.Book
import book.tornPages
import kotlin.random.Random

class Puppy (val name: String) {

    fun playWithBook(book: Book) {
        val tornPages = Random.Default.nextInt(1, (book.pages * 0.3).toInt())
        book.tornPages(tornPages)
    }

}