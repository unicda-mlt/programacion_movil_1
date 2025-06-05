package game

class Movement (game: Game) {

    val path: MutableList<Directions> = mutableListOf(Directions.START)
    private val maze: Maze = game.maze
    private val location: Location = game.location
    private val mazeMatrix: Array<Array<MAZESYMBOL>> = game.mazeMatrix

    val north: () -> Boolean = {
        val previousY = location.localY
        val moveYUp = previousY - 1

        if (moveYUp <= maze.deep) {
            false
        }
        else {
            location.updateLocation(location.localX, moveYUp)
            path.add(Directions.NORTH)

            mazeMatrix[previousY][location.localX] = MAZESYMBOL.GROUND
            mazeMatrix[moveYUp][location.localX] = MAZESYMBOL.PLAYER

            true
        }
    }

    val south: () -> Boolean = {
        val previousY = location.localY
        val moveYDown = previousY + 1

        if (moveYDown >= maze.deep) {
            false
        }
        else {
            location.updateLocation(location.localX, moveYDown)
            path.add(Directions.SOUTH)

            mazeMatrix[previousY][location.localX] = MAZESYMBOL.GROUND
            mazeMatrix[moveYDown][location.localX] = MAZESYMBOL.PLAYER

            true
        }
    }

    val east: () -> Boolean = {
        val previousX = location.localX
        val moveXRight = previousX + 1

        if (moveXRight >= maze.large) {
            false
        }
        else {
            location.updateLocation(moveXRight, location.localY)
            path.add(Directions.EAST)

            mazeMatrix[location.localY][previousX] = MAZESYMBOL.GROUND
            mazeMatrix[location.localY][moveXRight] = MAZESYMBOL.PLAYER

            true
        }
    }

    val west: () -> Boolean = {
        val previousX = location.localX
        val moveXLeft = previousX - 1

        if (moveXLeft <= maze.large) {
            false
        }
        else {
            location.updateLocation(moveXLeft, location.localY)
            path.add(Directions.WEST)

            mazeMatrix[location.localY][previousX] = MAZESYMBOL.GROUND
            mazeMatrix[location.localY][moveXLeft] = MAZESYMBOL.PLAYER

            true
        }
    }

    val end: () -> Boolean = { path.add(Directions.END); true }

    private fun move(where: () -> Boolean): Boolean {
        return where()
    }

    fun makeMove(move: String): Boolean {
        val moveLowerCase = move.lowercase()

        return when (moveLowerCase) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            "final" -> move(end)
            else -> throw Exception("Movement not allowed")
        }
    }

}