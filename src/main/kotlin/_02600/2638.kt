package _02600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val cheese = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    val visited = Array(n) { BooleanArray(m) }
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)
    fun dfs(x: Int, y: Int) {
        visited[x][y] = true
        for (i in 0 until 4) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx !in 0 until n || ny !in 0 until m || visited[nx][ny]) continue
            if (cheese[nx][ny] == 0) {
                dfs(nx, ny)
            } else {
                cheese[nx][ny]++
            }
        }
    }
    var time = 0
    while (true) {
        dfs(0, 0)
        var isAllMelted = true
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (cheese[i][j] >= 3) {
                    cheese[i][j] = 0
                    isAllMelted = false
                } else if (cheese[i][j] == 2) {
                    cheese[i][j] = 1
                }
                visited[i][j] = false
            }
        }
        if (isAllMelted) break
        time++
    }
    println(time)
}