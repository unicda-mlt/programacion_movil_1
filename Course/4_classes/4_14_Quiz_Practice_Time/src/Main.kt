import spice.BrownSpiceColor
import spice.Color
import spice.Curry
import spice.Spice
import kotlin.random.Random

fun main () {
    println("Portion of salt: ${getGramOfSalt()}gm")

    val spiceContainers = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Brown Curry", "hot", BrownSpiceColor))
    )

    println("-- Spice Containers --")

    for (spiceContainer in spiceContainers) {
        println("Label: ${spiceContainer.label} / Spice Color: ${spiceContainer.spice.color}")
    }
}

fun getGramOfSalt () = Random.nextInt(1, 2000)

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}