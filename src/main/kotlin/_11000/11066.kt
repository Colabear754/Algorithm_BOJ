package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val K = readLine().toInt()
        val sum = IntArray(K + 1)
        StringTokenizer(readLine()).apply { repeat(K) { i -> nextToken().toInt().also { sum[i + 1] = sum[i] + it } } }
        val dp = Array(K + 1) { IntArray(K + 1) }
        for (i in 1..K) {
            for (j in i + 1..K) {
                dp[j - i][j] = Int.MAX_VALUE
                for (k in j - i until j) {
                    dp[j - i][j] = minOf(dp[j - i][j], dp[j - i][k] + dp[k + 1][j] + sum[j] - sum[j - i - 1])
                }
            }
        }
        bw.write("${dp[1][K]}\n")
    }
    bw.close()
}