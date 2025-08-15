package _18100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val paths = List(n + 1) { mutableListOf<Pair<Int, Int>>() }
    repeat(n - 1) {
        StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }.let { (a, b, c) ->
            paths[a].add(b to c)
            paths[b].add(a to c)
        }
    }
    val visited = BooleanArray(n + 1)
    val queue = ArrayDeque<Pair<Int, Long>>()
    queue.add(1 to 0L)
    visited[1] = true
    var maxDistance = 0L
    while (queue.isNotEmpty()) {
        val (currentNode, currentDistance) = queue.removeFirst()
        for ((nextNode, distance) in paths[currentNode]) {
            if (!visited[nextNode]) {
                val nextDistance = currentDistance + distance
                maxDistance = maxOf(maxDistance, nextDistance)
                visited[nextNode] = true
                queue.add(nextNode to nextDistance)
            }
        }
    }
    println(maxDistance)
}