package _02500

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val connection = IntArray(501)
    val dp = IntArray(501)
    repeat(n) { StringTokenizer(readLine()).apply { connection[nextToken().toInt()] = nextToken().toInt() } }
    var max = 0
    for (i in 1..500) {
        if (connection[i] == 0) continue
        dp[i] = 1
        for (j in 1 until i) {
            if (connection[j] == 0) continue
            if (connection[i] > connection[j]) dp[i] = maxOf(dp[i], dp[j] + 1)
        }
        max = maxOf(max, dp[i])
    }
    println(n - max)
}