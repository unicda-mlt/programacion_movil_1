package book

class Book (val title: String, val author: String, val year: Int) {

    fun getTitleAuthor (): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear (): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

}