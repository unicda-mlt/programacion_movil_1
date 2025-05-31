import java.util.Arrays
 
// // Kotlin Practice: Null Safety, Lists & Arrays (Basic Level - Challenge Mode)
// // 2025-05-29
// // Ejercicios Laboratorio
fun main() {
    println("Exercise 1 - Optional User Details")
 
    val userName: String? = "Maximo"
    val userEmail: String? = "maximo@unicda.edu.do"
    val userBio: String? = null
 
    println("Name: ${userName ?: "Not provided"}")
    println("Email: ${userEmail ?: "Not available"}")
    println("Name: ${(if (userBio != null && userBio.length === 0) "User has no bio or it's empty" else userBio) ?: "User has no bio"}")
 
    /////////////////////////
 
    println("\nExercise 2 - Simple To-Do List")
 
    val toDoList: List<String?> = mutableListOf("Make the breakfast", "Take a shower", null, "Go to sleep")
    val notDescription = "No task description"
 
    for ((idx, toDo) in toDoList.withIndex()) println("${idx.inc()}. ${toDo ?: notDescription}")
 
    if (toDoList.count() > 0) {
        println("First task: ${toDoList?.first() ?: notDescription}")
    }
    else {
        println("No taks in the list")
    }
    /////////////////////////
 
    println("\nExercise 3 - Item Prices")
    val productNames: Array<String?> = arrayOf("Shirt", "Sugar", null, "Salmon")
    val productPrices: Array<Double?> = arrayOf(20.0, 3.45, 4.0, null)
 
    var productIdx = 0
    val totalProductNames = productNames.count()
    val totalProductPrices = productPrices.count()
 
	while (productIdx < totalProductNames) {
		val productName = "Item: ${productNames[productIdx] ?: "Not available"}"
 
        if (productIdx > totalProductPrices) {
            println("Invalid item index")
            break
        }
 
        val productPrice = productPrices[productIdx]
        val productPriceTag = "Price: ${if (productPrice != null) "$${productPrice}" else "Not available"}"
 
        println("${productIdx + 1}. $productName, $productPriceTag")
        productIdx++
    }
 
	/////////////////////////
 
    println("\nExercise 4 - Default Configuration Values")
 
    var settingColorTheme: String? = "Red"
    var settingFontSize: String? = null
	var actualColorTheme = settingColorTheme ?: "Ligth"
	var actualFontSize = settingFontSize ?: 12
 
	println("Applying theme: $actualColorTheme, Font size: $actualFontSize")
 
    /////////////////////////
 
    println("\nExercise 5- Summing Nullable Scores")
 
    val scores: List<Int?> = listOf(75, 80, null, 85, 95, null)
    val notEmptyScores = mutableListOf<Int>()
    var totalScore = 0
 
    for ((idx, score) in scores.withIndex()) {
        val idxPlusOne = idx.inc()
 
        if (score == null) {
            println("${idxPlusOne}. Attempt missed")
            continue
        }
 
        notEmptyScores.add(score) 
        totalScore += score
        println("${idxPlusOne}. Score recored [$score]")
    }
 
    println("Total score from recorded attempts: $totalScore")
    println(notEmptyScores)
}