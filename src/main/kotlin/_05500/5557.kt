package _05500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numbers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = Array(n - 1) { LongArray(21) }
    dp[0][numbers[0]] = 1L
    for (i in 0..<n - 2) {
        val next = numbers[i + 1]
        for (j in 0..20) {
            if (dp[i][j] == 0L) continue
            if (j + next <= 20) dp[i + 1][j + next] += dp[i][j]
            if (j - next >= 0) dp[i + 1][j - next] += dp[i][j]
        }
    }
    println(dp.last()[numbers.last()])
}