package _26000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val board = Array(5) { StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } } }
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    fun dfs(cr: Int, cc: Int, apple: Int, depth: Int): Int {
        val currentApple = apple + if (board[cr][cc] == 1) 1 else 0
        if (currentApple >= 2) return 1
        if (depth > 3) return 0
        var result = 0
        repeat(4) {
            val nr = cr + dr[it]
            val nc = cc + dc[it]
            if (nr !in 0..4 || nc !in 0..4 || board[nr][nc] == -1) return@repeat
            board[cr][cc] = -1
            result = result or dfs(nr, nc, currentApple, depth + 1)
            board[cr][cc] = 0
        }
        return result
    }
    println(dfs(r, c, 0, 1))
}