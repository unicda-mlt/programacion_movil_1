// // 4. Learn about nullability
// // https://developer.android.com/codelabs/android-development-kotlin-1.2?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-development-with-kotlin-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-development-kotlin-1.2#3
// // 2025-05-29
// // Ejercicios Laboratorio
fun main() {
    println("#1 - Learn about nullability")
 
    var cannotBeNull: Int = null
    var canBeNull: Int? = null
 
    /////////////////////////
    println("\n#2 - Learn about the ? and ?: operators")
 
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
 
    println("fishFoodTreats: $fishFoodTreats")
 
    fishFoodTreats?.dec()
 
    println("fishFoodTreats: $fishFoodTreats")
 
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
 
    println("fishFoodTreats: $fishFoodTreats")
 
    val isAlwaysNull: String? = null
    isAlwaysNull!!.length
}