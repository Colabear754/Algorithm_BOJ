package _01200

import kotlin.math.max

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val castle = Array(n) { "" }
    for (i in 0 until n) {
        castle[i] = readln()
    }

    var row = 0
    var column = 0
    for (i in castle.indices) {
        if (!castle[i].contains('X')) {
            row++
        }
    }

    for (i in 0 until m) {
        var check = false
        for (j in 0 until n) {
            if (castle[j][i] == 'X') {
                check = true
                break
            }
        }
        if (!check) {
            column++
        }
    }

    println(max(row, column))
}