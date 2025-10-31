package _02200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val board = Array(5) { StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } } }
    val results = HashSet<Int>()
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    fun dfs(r: Int, c: Int, depth: Int, number: Int) {
        if (depth == 5) {
            results.add(number)
            return
        }
        for (i in 0..3) {
            val nr = r + dr[i]
            val nc = c + dc[i]
            if (nr in 0..4 && nc in 0..4) {
                dfs(nr, nc, depth + 1, number * 10 + board[nr][nc])
            }
        }
    }
    board.forEachIndexed { r, row -> row.forEachIndexed { c, cell -> dfs(r, c, 0, cell) } }
    println(results.size)
}