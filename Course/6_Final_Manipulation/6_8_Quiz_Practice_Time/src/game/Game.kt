package game

import kotlin.random.Random

class Game (val maze: Maze, val location: Location) {

    internal val mazeMatrix: Array<Array<MAZESYMBOL>>
    private var _fruitPosition: Point = Point(0, 0)
    private var _startTime: Long = 0
    private var _endTime: Long = 0

    init {
        if (location.initialX > maze.large) {
            throw Exception("Initial \"x\" (${location.initialX}) value can not be bigger than maze width (${maze.large})")
        }

        if (location.initialY > maze.deep) {
            throw Exception("Initial \"y\" (${location.initialY}) value can not be bigger than maze width (${maze.deep})")
        }

        mazeMatrix = Array(maze.deep) { Array(maze.large) { MAZESYMBOL.GROUND } }
    }

    val fruitPosition: Point
        get() { return fruitPosition }

    val startTime: Long
        get() { return startTime }

    val endTime: Long
        get() { return endTime }

    val playerCaughtFruit: Boolean
        get() { return _fruitPosition.x == location.localX && _fruitPosition.y == location.localY }

    fun start() {
        _fruitPosition = calculateRandomFruitPoint(maze, location.point)

        mazeMatrix[location.initialY][location.initialX] = MAZESYMBOL.PLAYER
        mazeMatrix[_fruitPosition.y][_fruitPosition.x] = MAZESYMBOL.FRUIT
        _startTime = System.currentTimeMillis()
    }

    fun end(): Long {
        return System.currentTimeMillis() - _startTime
    }

    fun printMazeScreenShot () {
        val wallVertical = "${MAZESYMBOL.WALLVERTICAL.value}"
        val wallHorizontal = "${MAZESYMBOL.WALLHORIZONTAL.value}"
        println(wallVertical.repeat(mazeMatrix[0].size + 2))

        for (row in mazeMatrix) {
            println("$wallHorizontal${row.map { it.value }.joinToString("")}$wallHorizontal")
        }

        print(wallVertical.repeat(mazeMatrix[0].size + 2))
    }

}

fun getRandomPoint (maze: Maze): Point {
    val x = Random.nextInt(0, maze.large)
    val y = Random.nextInt(0, maze.deep)
    return Point(x, y)
}

fun calculateRandomFruitPoint (maze: Maze, playerPosition: Point): Point {
    var point: Point

    do {
        point = getRandomPoint(maze)
    } while (point == playerPosition)

    return point
}