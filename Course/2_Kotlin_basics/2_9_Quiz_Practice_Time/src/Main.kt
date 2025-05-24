
fun main () {
    println("1. strings")

    val troutFish = "yes"
    val haddockFish = "yes"
    val snapperFish = "yes"

    println("Fishes I do and don't like:")
    println("trout: $troutFish")
    println("haddock: $haddockFish")
    println("snapper: $snapperFish")

    /////////////////////////

    println("\n2. when statement")

    val fishName: String = "haddock"

    when (fishName.length) {
        0 -> println("Error: there is not fish name.")
        in 3..12 -> println("Good fish name.")
        else -> println("OK fish name")
    }
}