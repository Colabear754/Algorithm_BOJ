package _31900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val board = Array(n) { StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } } }
    val dp = Array(n) { LongArray(n) }.apply { this[0][0] = board[0][0] }
    for (i in 1..<n) {
        dp[0][i] = (dp[0][i - 1] shl 1) + board[0][i]
        dp[i][0] = (dp[i - 1][0] shl 1) + board[i][0]
    }
    for (i in 1..<n) {
        for (j in 1..<n) {
            dp[i][j] = (maxOf(dp[i - 1][j], dp[i][j - 1]) shl 1) + board[i][j]
        }
    }
    println(dp.last().last())
}