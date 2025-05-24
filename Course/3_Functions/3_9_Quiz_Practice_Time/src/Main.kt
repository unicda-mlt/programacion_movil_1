
fun main () {
    val birthday = getBirthday()
    val fortune = getFortuneCookie(birthday)

    println("Your fortune is: $fortune")
}

fun getFortuneCookie(randomNumber: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when (randomNumber) {
        28, 31 -> "An exiting adventure awaits you."
        in 1..7 -> "You will soon receive a surprise from a lover."
        else -> fortunes[randomNumber % fortunes.size]
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")

    val birthdayInput = readLine()

    return birthdayInput?.toIntOrNull() ?: 1
}