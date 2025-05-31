package book

open class Book (val name: String, val author: String) {

    private var currentPage = 0

    open fun readPage() {
        currentPage += 1
    }

    val getCurrentPage: Int
        get() { return currentPage }

}