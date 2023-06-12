package _11400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val graph = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    for (k in 0 until n) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (graph[i][k] == 1 && graph[k][j] == 1) {
                    graph[i][j] = 1
                }
            }
        }
    }
    println(graph.joinToString("\n") { it.joinToString(" ") })
}