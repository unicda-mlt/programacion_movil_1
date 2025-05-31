package spice

import kotlin.random.Random

fun main () {
    println("Portion of salt: ${getGramOfSalt()}gm\n")

    val spices = listOf(
        Spice("Bell Pepper", "mild"),
        Spice("Poblano", "medium"),
        Spice("Jalapeño", "hot"),
        Spice("Serrano", "hot"),
        Spice("Habanero", "extrahot")
    )

    println("\nList of sweet spices:")

    for (spice in spices.filter { it.heat < 10000 }) {
        println(spice.toString())
    }
}

fun getGramOfSalt () = Random.nextInt(1, 451)