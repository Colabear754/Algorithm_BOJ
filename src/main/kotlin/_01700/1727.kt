package _01700

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val boys = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.sortedArray()
    val girls = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }.sortedArray()
    val dp = Array(n + 1) { IntArray(m + 1) }
    for (i in 1..n) {
        for (j in 1..m) {
            dp[i][j] = dp[i - 1][j - 1] + abs(boys[i -1] - girls[j - 1])
            dp[i][j] = if (i > j) minOf(dp[i][j], dp[i - 1][j]) else if (i < j) minOf(dp[i][j], dp[i][j - 1]) else dp[i][j]
        }
    }
    println(dp[n][m])
}