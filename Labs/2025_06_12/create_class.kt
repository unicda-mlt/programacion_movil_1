
// // https://developer.android.com/codelabs/android-development-kotlin-3.1#1
// // 2025-06-12
// // 2. Create a class
fun main() {
    buildAquarium()

}

class Aquarium {
    var width: Int = 30
    var height: Int = 50
    var length: Int = 110
    
    fun printSize() {
        print("Width: $width cm, ")
        print("Length: $length cm, ")
        println("Height: $length cm")
    }
}

fun buildAquarium() {
    val aquarium = Aquarium()
    aquarium.printSize()
    aquarium.width += 5
    aquarium.height += 5
    aquarium.length += 5
    aquarium.printSize()
}