package book

class Book (val title: String, val author: String, val year: Int) {

    private companion object Constants {
        const val BASE_URL = "https://mybooks.do"
    }

    fun canBorrow (hasBooks: Int): Boolean {
        return hasBooks < MAX_BORROW_BOOKS
    }

    fun printUrl () {
        println(BASE_URL + "/book?${title.lowercase().replace(Regex("[^a-zA-Z0-9]"), "")}_$year")
    }

}