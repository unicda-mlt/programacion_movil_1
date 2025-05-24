
fun main () {
    println("1. mutable list")

    val numbers = Array(5) { 11 + it }
    val mutableStringList = mutableListOf<String>()

    for (number in numbers) {
        mutableStringList.add(number.toString())
    }

    println(mutableStringList.toString())

    /////////////////////////

    println("\n2. numbers divisible by 7")

    val numberDivisibleBySeven = mutableListOf<String>()

    for (number in 0..100 step 7) {
        numberDivisibleBySeven.add(number.toString())
    }

    println(numberDivisibleBySeven.toString())
}