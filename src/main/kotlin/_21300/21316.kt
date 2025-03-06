package _21300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val edgeCounts = IntArray(13)
    val graph = List(13) { mutableListOf<Int>() }
    repeat(12) {
        StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }.let { (a, b) ->
            graph[a].add(b)
            graph[b].add(a)
            edgeCounts[a]++
            edgeCounts[b]++
        }
    }
    for (i in 1..12) {
        if (edgeCounts[i] == 3 && graph[i].sumOf { edgeCounts[it] } == 6) {
            return@with println(i)
        }
    }
}