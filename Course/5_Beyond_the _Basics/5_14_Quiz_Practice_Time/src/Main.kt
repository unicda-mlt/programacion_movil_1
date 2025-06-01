package buildings

fun main () {
    val buildWood = Building(Wood())
    val buildBrick = Building(Brick())

    println("To build a building of Wood we required ${buildWood.build()}.")
    println("To build a building of Brick we required ${buildBrick.build()}.")
}