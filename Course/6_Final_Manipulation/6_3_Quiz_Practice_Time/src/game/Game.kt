package game

class Game (var path: MutableList<Directions> = mutableListOf(Directions.START)) {

    val north: () -> Unit = { path.add(Directions.NORTH) }
    val south: () -> Unit = { path.add(Directions.SOUTH) }
    val east: () -> Unit = { path.add(Directions.EAST) }
    val west: () -> Unit = { path.add(Directions.WEST) }
    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over: $path")
        false
    }

}