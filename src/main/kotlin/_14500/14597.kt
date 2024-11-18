package _14500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (h, w) = readLine().split(' ').map { it.toInt() }
    val b1 = Array(h) { StringTokenizer(readLine()).run { IntArray(w) { nextToken().toInt() } } }
    val b2 = Array(h) { StringTokenizer(readLine()).run { IntArray(w) { nextToken().toInt() } } }
    val dp = Array(h) { IntArray(w) }
    for (i in 0..<h) {
        for (j in 0..<w) {
            dp[i][j] = (b1[i][j] - b2[i][j]).let { it * it }
            if (i == 0) continue
            dp[i][j] += minOf(if (j == 0) Int.MAX_VALUE else dp[i - 1][j - 1], dp[i - 1][j], if (j == w - 1) Int.MAX_VALUE else dp[i - 1][j + 1])
        }
    }
    println(dp[h - 1].min())
}