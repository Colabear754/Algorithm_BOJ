package _24400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, r) = readLine().split(' ').map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }
    repeat(m) {
        StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }.also { (a, b) ->
            graph[a].add(b)
            graph[b].add(a)
        }
    }
    graph.forEach { it.sortDescending() }
    val result = IntArray(n + 1)
    var current = 1
    fun dfs(v: Int) {
        result[v] = current++
        graph[v].forEach { if (result[it] == 0) dfs(it) }
    }
    dfs(r)
    for (i in 1..n) {
        bw.write("${result[i]}\n")
    }
    bw.close()
}