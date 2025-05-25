
fun main () {
    println("What is your mood today?")
    print("=> ")
    val mood = readLine()!!.lowercase()

    println()

    print(whatShouldIDoToday(mood))
    print(whatShouldIDoToday(mood, "rainy"))
    print(whatShouldIDoToday(mood, "cloudy", 18))
    print(whatShouldIDoToday(mood, "sunny", 30))
    print(whatShouldIDoToday(mood, "rainy", 12))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    val params = "mood: $mood; weather: $weather; temperature: $temperature"

    val toDo = when {
        isHappyAndSunnyAndWarm(mood, weather, temperature) -> "Go for a picnic!"
        isSadAndRainy(mood, weather) -> "Stay in and watch a movie."
        isExcitedAndMild(mood, temperature) -> "Try a new sport or activity!"
        isBoredAndHot(mood, weather, temperature) -> "Go to the beach!"
        isTiredAndColdAndRainy(mood, weather, temperature) -> "Take a nap with a warm drink."
        else -> "Just relax and do whatever makes you feel good."
    }

    return "$params\n$toDo\n\n"
}

fun isHappyAndSunnyAndWarm(mood: String, weather: String, temperature: Int) =
    (mood == "happy" && weather == "sunny" && temperature > 20)

fun isSadAndRainy(mood: String, weather: String) =
    (mood == "sad" && weather == "rainy")

fun isExcitedAndMild(mood: String, temperature: Int) =
    (mood == "excited" && temperature in 15..25)

fun isBoredAndHot(mood: String, weather: String, temperature: Int) =
    (mood == "bored" && weather == "sunny" && temperature > 25)

fun isTiredAndColdAndRainy(mood: String, weather: String, temperature: Int) =
    (mood == "tired" && weather == "rainy" && temperature < 15)

