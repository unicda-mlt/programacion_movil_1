package game

class Location (val initialX: Int = 0, val initialY: Int = 0) {

    val point = Point(initialX, initialX)

    val localX: Int
        get() { return point.x }

    val localY: Int
        get() { return point.y }

    fun updateLocation(x: Int, y: Int) {
        point.x = x
        point.y = y
    }

}
