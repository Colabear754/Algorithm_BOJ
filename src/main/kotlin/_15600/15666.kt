package _15600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.sortedArray() }
    val selected = IntArray(m)
    fun dfs(depth: Int) {
        if (depth == m) {
            bw.write("${selected.joinToString(" ")}\n")
            return
        }
        var prev = -1
        for (num in arr) {
            if (depth > 0 && selected[depth - 1] > num) continue
            if (prev != num) {
                selected[depth] = num
                prev = num
                dfs(depth + 1)
            }
        }
    }
    dfs(0)
    bw.close()
}