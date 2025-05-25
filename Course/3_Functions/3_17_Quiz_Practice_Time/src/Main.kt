
fun main () {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    val spicyContainCurries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(spicyContainCurries)

    val spicyStartCEndE_1 = spices.filter { it.startsWith("c") && it.endsWith("e") }
    val spicyStartCEndE_2 = spices.asSequence().filter { it.startsWith("c") && it.endsWith("e") }

    println(spicyStartCEndE_1)
    println(spicyStartCEndE_2.toList())

    val spicyThreeFirstElementStartC = spices.take(3).filter { it.startsWith("c") }
    println(spicyThreeFirstElementStartC)
}