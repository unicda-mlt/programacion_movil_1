package book

class Book (val title: String, val author: String, val year: Int, var pages: Int)

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(tornPages: Int) {
    pages = (pages - tornPages).coerceAtLeast(0)
}