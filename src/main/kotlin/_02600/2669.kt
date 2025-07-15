package _02600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val inputs = Array(4) { StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } } }
    val board = Array(100) { BooleanArray(100) }
    for ((x1, y1, x2, y2) in inputs) {
        for (i in x1..<x2) {
            for (j in y1..<y2) {
                board[i][j] = true
            }
        }
    }
    println(board.sumOf { row -> row.count { it } })
}