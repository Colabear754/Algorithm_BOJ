package _30000

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (I, n, k) = readLine().split(' ').map { it.toInt() }
    val ink = readLine().toCharArray()
    var (y, x) = 0 to 0
    val map = Array(n) { readLine().toCharArray() }
    loop@ for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] == '@') {
                map[i][j] = '.'
                y = i
                x = j
                break@loop
            }
        }
    }
    val command = readLine()
    var chargedInk = 0
    var currentColor = 0
    for (com in command) {
        when (com) {
            'U' -> if (y >= 1 && map[y - 1][x] == '.') y--
            'D' -> if (y < n - 1 && map[y + 1][x] == '.') y++
            'L' -> if (x >= 1 && map[y][x - 1] == '.') x--
            'R' -> if (x < n - 1 && map[y][x + 1] == '.') x++
            'j' -> chargedInk++
            'J' -> {
                for (i in 0 until n) {
                    for (j in 0 until n) {
                        if (abs(y - i)  + abs(x - j) <= chargedInk && map[i][j] != '.') map[i][j] = ink[currentColor]
                    }
                }
                chargedInk = 0
                currentColor = (currentColor + 1) % I
            }
        }
    }
    map[y][x] = '@'
    println(map.joinToString("\n") { it.joinToString("") })
}