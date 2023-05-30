package _11600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = arrayOf(IntArray(n + 1)) + Array(n) { IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val sum = Array(n + 1) { IntArray(n + 1) }
    for (i in 1..n) {
        for (j in 1..n) {
            sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + arr[i][j]
        }
    }
    repeat(m) {
        val (x1, y1, x2, y2) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
        bw.write("${sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1]}\n")
    }
    bw.close()
}