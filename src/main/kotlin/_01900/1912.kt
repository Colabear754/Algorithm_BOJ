package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = IntArray(n)
    dp[0] = arr[0]
    var max = dp[0]
    for (i in 1 until n) {
        dp[i] = maxOf(dp[i - 1] + arr[i], arr[i])
        max = maxOf(max, dp[i])
    }
    println(max)
}