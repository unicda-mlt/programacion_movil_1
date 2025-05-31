import kotlin.random.Random

fun main () {
    println("#1. Roll dice")

    val rollDice = { sides: Int -> if (sides < 0) 0 else Random.nextInt(sides + 1) }
    val rollDice2: (Int) -> Int = { sides -> if (sides < 0) 0 else Random.nextInt(sides + 1) }

    println("First roll: ${rollDice(8)}")
    println("Second roll: ${rollDice2(8)}")

    /////////////////////////

    println("\n#2. Roll dice gameplay")

    fun gamePlay(rollDice: (Int) -> Int) {
        val result = rollDice(10)
        println("Roll result: ${result}")
    }

    gamePlay(rollDice2)
}