package _15600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.sortedArray() }
    val selected = IntArray(m)
    val visited = BooleanArray(n)
    fun dfs(depth: Int) {
        if (depth == m) {
            bw.write("${selected.joinToString(" ")}\n")
            return
        }
        var prev = -1
        for ((i, v) in arr.withIndex()) {
            if (!visited[i] && prev != v) {
                visited[i] = true
                selected[depth] = v
                prev = v
                dfs(depth + 1)
                visited[i] = false
            }
        }
    }
    dfs(0)
    bw.close()
}