package _16500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (r, c, q) = readLine().split(' ').map { it.toInt() }
    val sum = Array(r + 1) { IntArray(c + 1) }
    for (i in 1..r) {
        val photo = StringTokenizer(readLine()).run { IntArray(c) { nextToken().toInt() } }
        for (j in 1..c) {
            sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + photo[j - 1]
        }
    }
    repeat(q) {
        val (r1, c1, r2, c2) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
        val result = sum[r2][c2] - sum[r1 - 1][c2] - sum[r2][c1 - 1] + sum[r1 - 1][c1 - 1]
        bw.write("${result / ((r2 - r1 + 1) * (c2 - c1 + 1))}")
        bw.newLine()
    }
    bw.close()
}