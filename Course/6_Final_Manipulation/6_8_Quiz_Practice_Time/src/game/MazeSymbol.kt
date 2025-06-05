package game

enum class MAZESYMBOL(val value: Char) {
    PLAYER('*'),
    FRUIT('°'),
    GROUND(' '),
    WALLVERTICAL('#'),
    WALLHORIZONTAL('|')
}