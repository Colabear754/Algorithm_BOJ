package _01200

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, m, v) = readLine().split(' ').map(String::toInt)
    val graph = Array(n + 1) { BooleanArray(n + 1) }
    val visited = BooleanArray(n + 1)
    repeat(m) {
        val (x, y) = StringTokenizer(readLine()).run { nextToken().toInt() to nextToken().toInt() }
        graph[x][y] = true
        graph[y][x] = true
    }
    sb.dfs(graph, visited, v)
    sb.append('\n')
    visited.fill(false)
    sb.bfs(graph, visited, v)
    println(sb)
}

private fun StringBuilder.dfs(arr: Array<BooleanArray>, visited: BooleanArray, v: Int) {
    visited[v] = true
    append("$v ")
    for (i in arr[v].indices) {
        if (arr[v][i] && !visited[i]) {
            dfs(arr, visited, i)
        }
    }
}

private fun StringBuilder.bfs(arr: Array<BooleanArray>, visited: BooleanArray, v: Int) {
    val queue = LinkedList<Int>()
    queue.add(v)
    visited[v] = true
    while (queue.isNotEmpty()) {
        val x = queue.poll()
        append("$x ")
        for (i in arr[x].indices) {
            if (arr[x][i] && !visited[i]) {
                queue.add(i)
                visited[i] = true
            }
        }
    }
}