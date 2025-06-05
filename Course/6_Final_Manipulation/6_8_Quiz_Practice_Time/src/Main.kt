package game

import java.util.Arrays

fun main() {
    var width = 0
    var height = 0
    val minimumSize = 1
    val maximumSize = 50
    var printError = false
    var startGame = false

    println("¡¡WELCOME TO CATCH THE FRUIT GAME!!")
    println("Capture the fruit as fast as you can do it...")
    println()
    printCommandList()
    println()

    do {
        if (printError) {
            println("The value must be an integer number between $minimumSize and $maximumSize.")
            println()
            printError = false
        }

        if (width == 0) {
            print("Insert how large the maze will be: ")
            width = readLine()?.toIntOrNull() ?: 0

            if (width < minimumSize || width > maximumSize) {
                width = 0
                printError = true
                continue
            }
        }

        if (height == 0) {
            print("Insert how deep the maze will be: ")
            height = readLine()?.toIntOrNull() ?: 0

            if (height < minimumSize || height > maximumSize) {
                height = 0
                printError = true
                continue
            }
        }

        if (width > 0 && height > 0) {
            startGame = true
        }
    } while (!startGame)

    println()
    println("You have created a maze [$width]x[$height]")

    val game = Game(Maze(width, height), Location())
    val movement = Movement(game)
    val allowedMoves = listOf("n", "s", "e", "w", "ss")
    var input: String? = null
    var isValidMovement = true

    game.start()

    while (true) {
        println()
        print("Enter a direction: n/s/e/w: ")
        input = readLine()?.lowercase()

        if (input == "exit") {
            println("Thank for playing!")
            movement.makeMove("final")
            break
        }

        if (input == null || input !in allowedMoves) {
            println("Select a correct entry.")
            continue
        }

        if (input == "ss") {
            println()
            game.printMazeScreenShot()
            println()
            continue
        }

        isValidMovement = movement.makeMove(input)

        if (!isValidMovement) {
            println("¡There is a wall!")
            continue
        }

        if (game.playerCaughtFruit) {
            movement.makeMove("final")
            val duration = game.end()

            println()
            println("¡¡¡You caught the fruit!!!")
            println("Time ${formatMillisecondToHuman(duration)}")
            break
        }
    }
}


fun formatMillisecondToHuman(ms: Long): String {
    val seconds = ms / 1000
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val secs = seconds % 60

    return String.format("%02d:%02d:%02d", hours, minutes, secs)
}

fun printCommandList() {
    println("## Command list ##")
    println("n: move to north")
    println("s: move to south")
    println("n: move to east")
    println("n: move to west")
    println("ss: see maze state")
    println("exit: finish the game")
    println("## Command list ##")
}