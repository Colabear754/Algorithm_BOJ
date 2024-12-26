package _17400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val space = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    val dp = Array(n) { Array(m) { IntArray(3) { Int.MAX_VALUE } } }
    for (i in 0..<m) {
        dp[0][i][0] = space[0][i]
        dp[0][i][1] = space[0][i]
        dp[0][i][2] = space[0][i]
    }
    for (i in 1..<n) {
        for (j in 0..<m) {
            when (j) {
                0 -> {
                    dp[i][j][0] = minOf(dp[i - 1][1][1], dp[i - 1][1][2]) + space[i][j]
                    dp[i][j][1] = dp[i - 1][j][0] + space[i][j]
                }
                m - 1 -> {
                    dp[i][j][1] = dp[i - 1][j][2] + space[i][j]
                    dp[i][j][2] = minOf(dp[i - 1][m - 2][0], dp[i - 1][m - 2][1]) + space[i][j]
                }
                else -> {
                    dp[i][j][0] = minOf(dp[i - 1][j + 1][1], dp[i - 1][j + 1][2]) + space[i][j]
                    dp[i][j][1] = minOf(dp[i - 1][j][0], dp[i - 1][j][2]) + space[i][j]
                    dp[i][j][2] = minOf(dp[i - 1][j - 1][0], dp[i - 1][j - 1][1]) + space[i][j]
                }
            }
        }
    }
    println(dp.last().minOf { it.min() })
}