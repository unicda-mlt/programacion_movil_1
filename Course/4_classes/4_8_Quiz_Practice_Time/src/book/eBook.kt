package book

class eBook(name: String, author: String, val format: String = "text") : Book(name, author) {

    private var wordCount = 0

    override fun readPage() {
        super.readPage()
        wordCount += 250
    }

    val getCurrentWordCount: Int
        get() { return wordCount }

}