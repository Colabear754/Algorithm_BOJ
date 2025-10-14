package _02100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val sum = Array(n + 1) { IntArray(m + 1) }
    for (i in 1..n) {
        StringTokenizer(readLine()).run { for (j in 1..m) sum[i][j] = nextToken().toInt() + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] }
    }
    repeat(readLine().toInt()) {
        val (i, j, x, y) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
        bw.appendLine("${sum[x][y] - sum[i - 1][y] - sum[x][j - 1] + sum[i - 1][j - 1]}")
    }
    bw.close()
}