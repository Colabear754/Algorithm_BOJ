package _26000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var zeroCount = 0
    var oneCount = 0
    val board = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt().also { if (it == 0) zeroCount++ else oneCount++} } } }
    if (zeroCount and 1 == 1 || oneCount and 1 == 1) {
        return@with println(-1)
    }
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    for (i in board.indices) {
        for (j in board[i].indices) {
            val current = board[i][j]
            repeat(4) {
                val nr = i + dr[it]
                val nc = j + dc[it]
                if (nr !in 0..<n || nc !in 0..<m) return@repeat
                if (current == board[nr][nc]) return@with println(1)
            }
        }
    }
    println(-1)
}