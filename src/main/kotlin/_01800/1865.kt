package _01800

import java.util.StringTokenizer

private const val INF = 1000000000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, m, w) = readLine().split(' ').map { it.toInt() }
        val graph = Array(n + 1) { ArrayList<Wormhole>() }
        repeat(m) {
            StringTokenizer(readLine()).apply {
                val (s, e, t) = IntArray(3) { nextToken().toInt() }
                graph[s].add(Wormhole(e, t))
                graph[e].add(Wormhole(s, t))
            }
        }
        repeat(w) {
            StringTokenizer(readLine()).apply { graph[nextToken().toInt()].add(Wormhole(nextToken().toInt(), -nextToken().toInt())) }
        }
        val distance = IntArray(n + 1) { INF }
        distance[1] = 0
        bw.write(if (bellmanFord(graph, distance, n)) "YES\n" else "NO\n")
    }
    bw.close()
}

private class Wormhole(val end: Int, val time: Int)

private fun bellmanFord(graph: Array<ArrayList<Wormhole>>, distance: IntArray, n: Int): Boolean {
    for (i in 1..n) {
        for (j in 1..n) {
            for (k in graph[j]) {
                if (distance[k.end] > distance[j] + k.time) {
                    distance[k.end] = distance[j] + k.time
                    if (i == n) return true
                }
            }
        }
    }
    return false
}