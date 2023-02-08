package _11000

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val matrixes = Array(n + 1) { if (it > 0) StringTokenizer(readLine()).run { Pair(nextToken().toInt(), nextToken().toInt()) } else Pair(0, 0) }
    val dp = Array(501) { IntArray(501) }
    for (i in 1 until n) {
        for (j in 1..n - i) {
            dp[j][i + j] = Int.MAX_VALUE
            for (k in j until i + j) {
                dp[j][i + j] = minOf(dp[j][i + j], dp[j][k] + dp[k + 1][i + j] + matrixes[j].first * matrixes[k].second * matrixes[i + j].second)
            }
        }
    }
    println(dp[1][n])
}