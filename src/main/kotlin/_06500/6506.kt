package _06500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String
    while (readLine().also { input = it } != "0 0") {
        val (n, k) = StringTokenizer(input).run { IntArray(2) { nextToken().toInt() } }
        val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
        val dp = Array(n) { LongArray(k + 1) }
        for (i in 0..<n) {
            dp[i][1] = 1L
            for (j in 0..<i) {
                if (array[j] >= array[i]) continue
                for (k in 2..k) {
                    dp[i][k] += dp[j][k - 1]
                }
            }
        }
        bw.appendLine("${dp.sumOf { it[k] }}")
    }
    bw.close()
}