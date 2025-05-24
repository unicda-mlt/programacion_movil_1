import kotlin.math.roundToInt

fun main () {
    println("\n1. fishes and aquarium")

    val fishes: Int = 2.plus(71).plus(233).minus(13)
    val aquariums: Int = fishes.div(30.0).roundToInt()

    println("fishes: $fishes")
    println("aquariums: $aquariums")

    /////////////////////////

    println("\n2. immutability")

    var rainbowColor: String = "blue"
    rainbowColor = "red"

    val blackColor: String = "black"
    blackColor = "white"

    /////////////////////////

    println("\n3. nullable")

    rainbowColor = null

    var greenColor: String? = null
    var blueColor = null

    println("greenColor $greenColor")
    println("blueColor $blueColor")

    /////////////////////////

    println("\n4. null list")

    val firstVariantNullList = listOf(null, null)
    val secondVariantNullList = arrayListOf(null, null)

    println("firstVariantNullList: $firstVariantNullList")
    println("secondVariantNullList: $secondVariantNullList")

    val firstVariantNullableList: List<Any?> = listOf(null, null)
    val secondVariantNullableList: List<Any?>? = null

    println("firstVariantNullableList: $firstVariantNullableList")
    println("secondVariantNullableList: $secondVariantNullableList")

    /////////////////////////

    println("\n5. default value if null")

    var nullTest: Int? = null

    nullTest = 1

    println("nullTest value: ${nullTest?.inc() ?: 0}")
}