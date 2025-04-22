package _19600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val meetings = IntArray(n) { StringTokenizer(readLine()).run { nextToken(); nextToken(); nextToken().toInt() } }
    if (n == 1) {
        return@with println(meetings[0])
    }
    val dp = IntArray(n)
    dp[0] = meetings[0]
    dp[1] = maxOf(meetings[1], dp[0])
    for (i in 2..<n) {
        dp[i] = maxOf(dp[i - 1], meetings[i] + dp[i - 2])
    }
    println(dp.last())
}