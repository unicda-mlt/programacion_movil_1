// // Ejercicios Laboratorio
fun main() {
    println("#1 - Simple Age Checker")
 
    var age: Short = 17
    if (age < 18) {
        println("Minor")
    }
    else {
        println("Adult")
    }
 
    /////////////////////////
 
    println("\n#2 - Grade Evaluator")
 
    val grade = 91
 
    if (grade >= 90) {
		println("A")
    }
    else if (grade >= 80) {
        println("B")
    }
    else if (grade >= 70) {
        println("C")
    }
    else if (grade >= 60) {
        println("D")
    }
    else {
        println("F")
    }
 
    /////////////////////////
 
    println("\n#3 - Traffic Light Simulator")
    var trafficLight: String = "Yellow"
 
    when (trafficLight) {
        "Red" -> println("Stop")
        "Yellow" -> println("Caution")
        "Green" -> println("Go")
        else -> println("Invalid light color")
    }
 
    /////////////////////////
 
    println("\n#4 - Even or Odd")
 
    val numberValue = 19
 
    if (numberValue % 2 == 0) {
        println("Even")
    }
    else {
        println("Odd")
    }
 
    /////////////////////////
 
    println("\n#5 - Login Attempt")
 
    val savedUsername = "user"
    val savedPassword = "pass"
    var enteredUsername = "user"
    var enteredPassword = "pass1"
 
    val validUsername = (savedUsername == enteredUsername)
    val validPassword = (savedPassword == enteredPassword)
 
    if (validUsername && validPassword) {
        println("Login Successful")
    }
    else if (!validUsername) {
        println("Incorrect Username")
    }
    else if (!validPassword) {
        println("Incorrect Password")
    }
 
    /////////////////////////
 
    println("\n#6 - Temperature Guide")
 
    val temperature: Int = 18
 
    val temperaturInHuman: String = when {
        temperature < 0 -> "Freezing! Wear very warm clothes."
        temperature in 0..10 -> "Cold. Wear a warm jacket."
        temperature in 11..20 -> "Cool. A light jacket should be fine."
        temperature in 21..30 -> "Warm. Enjoy the weather!"
        temperature > 30 -> "Hot! Stay hydrated."
		else -> "Temperature out of typical range"
    }
    println(temperaturInHuman)
 
    /////////////////////////
 
    println("\n#7 - Nullable Name Greeting")
 
    val userName: String? = "Alice"
 
    if (userName != null) {
        println("Hello, $userName")
    }
    else {
        println("Hellow, Guest!")
    }
}