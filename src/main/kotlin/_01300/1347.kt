package _01300

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    var position = Position(0, 0)
    var currentDirection = 0
    val directions = arrayOf(Position(1, 0), Position(0, -1), Position(-1, 0), Position(0, 1))
    var minR = 0
    var maxR = 0
    var minC = 0
    var maxC = 0
    val visitedPositions = mutableSetOf(position)
    for (command in readLine()) {
        when (command) {
            'F' -> {
                position += directions[currentDirection]
                visitedPositions.add(position)
                minR = minOf(minR, position.r)
                maxR = maxOf(maxR, position.r)
                minC = minOf(minC, position.c)
                maxC = maxOf(maxC, position.c)
            }
            'R' -> currentDirection = (currentDirection + 1) % 4
            'L' -> currentDirection = (currentDirection + 3) % 4
        }
    }
    val height = maxR - minR + 1
    val width = maxC - minC + 1
    val map = Array(height) { CharArray(width) { '#' } }
    for (visited in visitedPositions) {
        map[visited.r - minR][visited.c - minC] = '.'
    }
    println(map.joinToString("\n") { it.joinToString("") })
}

private data class Position(val r: Int, val c: Int) {
    operator fun plus(other: Position) = Position(r + other.r, c + other.c)
}