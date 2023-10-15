package _11700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val tree = Array(n + 1) { ArrayDeque<Int>() }
    val parent = IntArray(n + 1)
    repeat(n - 1) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        tree[a].add(b)
        tree[b].add(a)
    }
    val queue = ArrayDeque<Int>().apply { add(1) }
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        for (next in tree[current]) {
            if (parent[next] == 0) {
                parent[next] = current
                queue.add(next)
            }
        }
    }
    for (i in 2..n) bw.write("${parent[i]}\n")
    bw.close()
}