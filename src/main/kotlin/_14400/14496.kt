package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toInt() }
    if (a == b) println(0).also { return@with }
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = Array(n + 1) { BooleanArray(n + 1) }
    repeat(m) {
        val (x, y) = StringTokenizer(readLine()).run { nextToken().toInt() to nextToken().toInt() }
        map[x][y] = true
        map[y][x] = true
    }
    val deque = ArrayDeque<Int>().apply { add(a) }
    val visited = BooleanArray(n + 1)
    visited[a] = true
    val distance = IntArray(n + 1)
    while (deque.isNotEmpty()) {
        val x = deque.removeFirst()
        for (i in 1..n) {
            if (map[x][i] && !visited[i]) {
                deque.add(i)
                visited[i] = true
                distance[i] = distance[x] + 1
            }
        }
    }
    println(if (distance[b] == 0) -1 else distance[b])
}