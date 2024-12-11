package _01300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val computers = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        computers[b].add(a)
    }
    val result = mutableListOf(-1)
    var max = 0
    fun dfs(node: Int, visited: BooleanArray): Int {
        visited[node] = true
        var count = 1
        for (next in computers[node]) {
            if (!visited[next]) count += dfs(next, visited)
        }
        return count
    }
    for (i in 1..n) {
        val count = dfs(i, BooleanArray(n + 1))
        result.add(count)
        max = maxOf(max, count)
    }
    println((1..n).filter { result[it] == max }.joinToString(" "))
}