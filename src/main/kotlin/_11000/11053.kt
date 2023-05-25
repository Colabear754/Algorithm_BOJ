package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = IntArray(n)
    var max = 0
    for (i in 0 until n) {
        dp[i] = 1
        for (j in 0 until i)
            if (arr[i] > arr[j]) dp[i] = maxOf(dp[i], dp[j] + 1)
        max = maxOf(max, dp[i])
    }
    println(max)
}