// // 5. Explore arrays, lists, and loops
// // https://developer.android.com/codelabs/android-development-kotlin-1.2?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-development-with-kotlin-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-development-kotlin-1.2#4
// // 2025-05-29
// // Ejercicios Laboratorio
fun main() {
    println("#1 - Make lists")
 
    val food = listOf("meat", "milk", "bread")
    println("food: $food")
    val names = mutableListOf("maximo", "marcos", "rafael")
    println("names: $names")
 
    print("Add predro to list of names -> ")
    println(names.add("pedro"))
 
    println("names: $names")
    /////////////////////////
 
    println("\n#2 - Create arrays")
 
    val colors = arrayOf("red", "blue", "green")
 
    println("colors: ${Arrays.toString(colors)}")
 
    val mixArray = arrayOf("hey", 1, true, 4.0)
    println("mixArray: ${Arrays.toString(mixArray)}")
    val firstBrandArray = arrayOf("Apple", "Google")
    val secondBrandArray = arrayOf("Microsoft", "Amazon")
    val combinedBrandArray = firstBrandArray + secondBrandArray
    println("firstBrandArray: ${Arrays.toString(firstBrandArray)}")
    println("secondBrandArray: ${Arrays.toString(secondBrandArray)}")
    println("combinedBrandArray: ${Arrays.toString(combinedBrandArray)}")
    val numbers = intArrayOf(1, 2, 3)
    val countries = listOf("Dominican Republic", "Mexico", "Panam")
    val nestedList = listOf(numbers, countries, false)
    println("nestedList: $nestedList")
    val calculatedArray = Array(4) { it * 4 }
    println("calculatedArray: ${Arrays.toString(calculatedArray)}")
    /////////////////////////
 
    println("\n#2 - Create loops")
 
    val kindOfMusics = arrayOf("Pop", "Rock", "Romantic", "Salsa")
    println("for into kindOfMusic:")
    for (kindOfMusic in kindOfMusics) {
        println("- $kindOfMusic")
    }
    println()
    for ((index, kindOfMusic) in kindOfMusics.withIndex()) {
        println("$index. $kindOfMusic")
    }
    for (i in 3..8) print("$i ")
    println()
    for (i in 10 downTo 2) print("$i ")
    println()
    for (i in 3..8 step 2) print("$i ")
    println()
    for (i in 'f'..'q') print("$i ")
    println()
    var clicks = 0
    while (clicks < 25) {
        clicks++
    }
    println("clicks: $clicks")
    do {
		clicks--
    } while (clicks > 15)
    println("clicks: $clicks")
    repeat(3) {
		println("SPAM")
    }
}