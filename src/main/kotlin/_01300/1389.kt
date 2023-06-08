package _01300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val graph = Array(n + 1) { BooleanArray(n + 1) }
    repeat(m) {
        val (a, b) = StringTokenizer(readLine()).run { nextToken().toInt() to nextToken().toInt() }
        graph[a][b] = true
        graph[b][a] = true
    }
    val kevin = IntArray(n + 1) { Int.MAX_VALUE }
    for (i in 1..n) {
        val visited = BooleanArray(n + 1)
        val queue = ArrayDeque<Int>()
        queue.add(i)
        visited[i] = true
        var count = 0
        while (queue.isNotEmpty()) {
            count++
            repeat(queue.size) {
                val current = queue.removeFirst()
                for (j in 1..n) {
                    if (graph[current][j] && !visited[j]) {
                        visited[j] = true
                        queue.add(j)
                        kevin[i] += count
                    }
                }
            }
        }
    }
    println(kevin.indexOf(kevin.min()))
}