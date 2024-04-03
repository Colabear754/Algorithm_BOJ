package _14500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var input: String
    while (readLine().also { input = it } != "0") {
        val (n, s, t) = StringTokenizer(input).run { IntArray(3) { nextToken().toInt() } }
        val board = IntArray(n + 2)
        var index = 1
        while (index <= n) {
            StringTokenizer(readLine()).apply { while (hasMoreTokens()) board[index++] = nextToken().toInt() }
        }
        val dp = Array(t + 1) { IntArray(n + 2) { Int.MIN_VALUE } }
        dp[0][0] = 0
        var result = Int.MIN_VALUE
        for (i in 1..t) {
            for (j in 1..n + 1) {
                for (k in 1..s) {
                    if (j - k < 0 || dp[i - 1][j - k] == Int.MIN_VALUE) continue
                    dp[i][j] = maxOf(dp[i][j], dp[i - 1][j - k] + board[j])
                }
            }
            result = maxOf(result, dp[i][n + 1])
        }
        bw.write("$result")
        bw.newLine()
    }
    bw.close()
}