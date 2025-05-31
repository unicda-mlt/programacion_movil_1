import spice.Curry
import kotlin.random.Random

fun main () {
    println("Portion of salt: ${getGramOfSalt()}gm")
    println("\n-- Curry preparation --")

    val curry = Curry("Poblano", "medium")
    curry.prepareSpice()

    println("Result of a curry with ${curry.color} color")
}

fun getGramOfSalt () = Random.nextInt(1, 451)