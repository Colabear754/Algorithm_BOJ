package _15600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.`out`.bufferedWriter()
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.distinct().toIntArray().apply { sort() }
    val result = IntArray(m)
    fun dfs(depth: Int) {
        if (depth == m) {
            bw.appendLine(result.joinToString(" "))
            return
        }
        for (i in array.indices) {
            result[depth] = array[i]
            dfs(depth + 1)
        }
    }
    dfs(0)
    bw.close()
}