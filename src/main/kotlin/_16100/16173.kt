package _16100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val visited = Array(n) { BooleanArray(n) }
    visited[0][0] = true
    val queue = ArrayDeque<IntArray>().apply { add(intArrayOf(0, 0)) }
    val dr = intArrayOf(0, 1)
    val dc = intArrayOf(1, 0)
    while (queue.isNotEmpty()) {
        val (r, c) = queue.removeFirst()
        for (i in 0..<2) {
            val nr = r + dr[i] * map[r][c]
            val nc = c + dc[i] * map[r][c]
            if (nr == n - 1 && nc == n - 1) {
                println("HaruHaru")
                return@with
            }
            if (nr in 0..<n && nc in 0..<n && !visited[nr][nc]) {
                visited[nr][nc] = true
                queue.add(intArrayOf(nr, nc))
            }
        }
    }
    println("Hing")
}