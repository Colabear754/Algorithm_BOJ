package _01500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    val dp = Array(n) { IntArray(m) { -1 } }
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)

    fun dfs(x: Int, y: Int): Int {
        if (x == n - 1 && y == m - 1) return 1
        if (dp[x][y] != -1) return dp[x][y]
        dp[x][y] = 0
        for (i in 0 until 4) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx in 0 until n && ny in 0 until m && map[nx][ny] < map[x][y]) {
                dp[x][y] += dfs(nx, ny)
            }
        }
        return dp[x][y]
    }
    println(dfs(0, 0))
}