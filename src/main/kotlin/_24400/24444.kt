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
    graph.forEach { it.sort() }
    val result = IntArray(n + 1)
    val queue = ArrayDeque<Int>()
    queue.add(r)
    var current = 1
    result[r] = current
    while (queue.isNotEmpty()) {
        val v = queue.removeFirst()
        graph[v].forEach {
            if (result[it] == 0) {
                result[it] = ++current
                queue.add(it)
            }
        }
    }
    for (i in 1..n) bw.write("${result[i]}\n")
    bw.close()
}