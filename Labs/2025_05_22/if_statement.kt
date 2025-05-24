// // Kotlin basics
// // https://developer.android.com/codelabs/android-development-kotlin-1.2?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-development-with-kotlin-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-development-kotlin-1.2#2
fun main () {
    // 1. Write an if/else statement.
    val numberOfFish = 10
    val numberOfPlants = 5
    if (numberOfFish < numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
    // 2. Write an if statement using ".." operator
    val fish = 25
 
    if (fish in 20..30) {
        println(fish)
    }
    // 3. Using if with multiple cases
    if (numberOfFish == 0) {
        println("Empty tank")
    }
    else if (numberOfFish < 40) {
        println("Got fish!")
    }
    else {
        println("That's a lot of fish!")
    }
    // 4. Using when statement
    when (numberOfFish) {
        0 -> println("Empty tank")
        in 1..50 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}