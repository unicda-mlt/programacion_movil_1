
fun main() {
    val numberList = listOf(1, 3, 5, 6, 7, 21, 24, 30, 29, 41, 27)
    val numberListDivisibleByThree = numberList.divisibleBy { it.rem(3) }

    println("Number list: $numberList")
    println("Number list divisible by 3: $numberListDivisibleByThree")
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    return this.filter { block(it) == 0 }
}