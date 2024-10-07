package _02600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val inDegree = IntArray(n + 1)
    val graph = Array(n + 1) { ArrayList<Int>() }
    val result = ArrayList<Int>()
    repeat(m) {
        val input = ArrayList<Int>().apply { StringTokenizer(readLine()).apply { repeat(nextToken().toInt()) { add(nextToken().toInt()) } } }
        for (i in input.indices) {
            for (j in i + 1..<input.size) {
                graph[input[i]].add(input[j])
                inDegree[input[j]]++
            }
        }
    }
    val queue = ArrayDeque<Int>()
    for (i in 1..n) {
        if (inDegree[i] == 0) queue.add(i)
    }
    while (queue.isNotEmpty()) {
        val now = queue.removeFirst()
        result.add(now)
        for (next in graph[now]) {
            inDegree[next]--
            if (inDegree[next] == 0) queue.add(next)
        }
    }
    println(if (result.size == n) result.joinToString("\n") else 0)
}