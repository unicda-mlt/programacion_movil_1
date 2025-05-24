
fun main (args: Array<String>) {
    val hour = args[0].toByte()

    if (hour < 12) {
        println("Good morning, Kotlin")
    }
    else {
        println("Good night, Kotlin")
    }
}