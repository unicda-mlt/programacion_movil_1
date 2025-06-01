package buildings

fun main () {
    val buildWood = Building(Wood())
    val buildBrick = Building(Brick())

    println("To build a building of Wood we required ${buildWood.build()}.")
    println("To build a building of Brick we required ${buildBrick.build()}.")

    println()

    println("Is Wood building small?")
    println(isSmallBuilding(buildWood))

    println()

    println("Is Brick building small?")
    println(isSmallBuilding(buildBrick))
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>): String {
    return if (building.actualMaterialsNeeded < 500) "Yes" else "No"
}
