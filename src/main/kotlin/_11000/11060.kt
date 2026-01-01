package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 1) return@with println(0)
    val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val visited = IntArray(n)
    val deque = ArrayDeque<Int>()
    deque.addLast(0)
    while (deque.isNotEmpty()) {
        val current = deque.removeFirst()
        if (current + array[current] >= n - 1) return@with println(visited[current] + 1)
        for (i in 1..minOf(n - 1, array[current])) {
            val next = current + i
            if (visited[next] == 0) {
                deque.addLast(next)
                visited[next] = visited[current] + 1
            }
        }
    }
    println(-1)
}