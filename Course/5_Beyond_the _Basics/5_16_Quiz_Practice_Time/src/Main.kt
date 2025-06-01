package buildings

fun main () {
    val buildWood = Building(Wood())
    val buildBrick = Building(Brick())

    println("To build a building of Wood we required ${buildWood.build()}.")
    println("To build a building of Brick we required ${buildBrick.build()}.")

    println()

    println("What kind of building is a Wood building?")
    println(isSmallBuilding(buildWood))

    println()

    println("What kind of building is a Brick building?")
    println(isSmallBuilding(buildBrick))
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>): String {
    return if (building.actualMaterialsNeeded < 500) "Small building" else "Large building"
}
