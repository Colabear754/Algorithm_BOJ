package _17400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cost = arrayOf(IntArray(3)) + Array(n) { StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } } }
    val dp = Array(n + 1) { IntArray(3) }
    var min = 1000000000
    repeat(3) { i ->
        repeat(3) { j -> dp[1][j] = if (i == j) cost[1][j] else 1000000000 }
        for (j in 2..n) {
            dp[j][0] = minOf(dp[j - 1][1], dp[j - 1][2]) + cost[j][0]
            dp[j][1] = minOf(dp[j - 1][0], dp[j - 1][2]) + cost[j][1]
            dp[j][2] = minOf(dp[j - 1][0], dp[j - 1][1]) + cost[j][2]
        }
        repeat(3) { j -> if (i != j) min = minOf(min, dp[n][j]) }
    }
    println(min)
}