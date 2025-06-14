
// // https://developer.android.com/codelabs/android-development-kotlin-3.1#2
// // 2025-06-12
// // 3. Add class constructors
fun main() {
    buildAquarium()
}

class Aquarium (var width: Int = 30, var height: Int = 50, var length: Int = 110) {
    init {
        println("aquarium has been initialized")
    }
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    
    var volume: Int
    	get() = width * height * length / 1000 // 1000 cm^3 = 1 liter
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        print("Width: $width cm, ")
        print("Length: $length cm, ")
        println("Height: $length cm")

        println("Volume: $volume liters")
    }
}

fun buildAquarium() {
    println("aquarium0")
    val aquarium0 = Aquarium()
    aquarium0.printSize()

    println("\naquarium1")
    val aquarium1 = Aquarium(35, 55, 115)
    aquarium1.printSize()

    println("\naquarium2")
    val aquarium2 = Aquarium(length = 120)
    aquarium2.printSize()
    
    println("\naquarium3")
    val aquarium3 = Aquarium(numberOfFish = 50)
    aquarium3.printSize()
    aquarium3.volume = 40
    aquarium3.printSize()
    aquarium3.volume = 60
    aquarium3.printSize()
}