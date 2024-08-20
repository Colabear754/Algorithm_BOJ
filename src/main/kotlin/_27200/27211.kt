package _27200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val planet = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    val visited = Array(n) { BooleanArray(m) }
    val dr = intArrayOf(1, -1, 0, 0)
    val dc = intArrayOf(0, 0, 1, -1)
    var result = 0
    fun bfs(sr: Int, sc: Int) {
        val queue = ArrayDeque<Pair<Int, Int>>().apply { add(sr to sc) }
        visited[sr][sc] = true
        while (queue.isNotEmpty()) {
            val (r, c) = queue.removeFirst()
            for (i in 0..3) {
                val nr = (r + dr[i] + n) % n
                val nc = (c + dc[i] + m) % m
                if (planet[nr][nc] == 0 && !visited[nr][nc]) {
                    visited[nr][nc] = true
                    queue.add(nr to nc)
                }
            }
        }
    }
    for (i in 0..<n) {
        for (j in 0..<m) {
            if (planet[i][j] == 0 && !visited[i][j]) {
                bfs(i, j)
                result++
            }
        }
    }
    println(result)
}