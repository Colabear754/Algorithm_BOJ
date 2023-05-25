package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { StringTokenizer(readLine()).run { IntArray(it + 1) { nextToken().toInt() } } }
    val dp = Array(n) { IntArray(n) }
    dp[0][0] = arr[0][0]
    for (i in 1 until n) {
        for (j in 0..i) {
            dp[i][j] = when (j) {
                0 -> dp[i - 1][j]
                i -> dp[i - 1][j - 1]
                else -> maxOf(dp[i - 1][j - 1], dp[i - 1][j])
            } + arr[i][j]
        }
    }
    println(dp[n - 1].max())
}