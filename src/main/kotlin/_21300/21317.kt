package _21300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val jumpEnergy = Array(n + 1) { IntArray(2) }
    for (i in 1 until n) jumpEnergy[i] = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
    val k = readLine().toInt()
    val dp = Array(n + 1) { IntArray(2) { 1000000 } }
    if (n <= 2) {
        println(jumpEnergy[n - 1][0])
        return@with
    }
    dp[1][0] = 0
    dp[2][0] = jumpEnergy[1][0]
    dp[3][0] = minOf(jumpEnergy[1][0] + jumpEnergy[2][0], jumpEnergy[1][1])
    for (i in 4..n) {
        dp[i][0] = minOf(dp[i - 1][0] + jumpEnergy[i - 1][0], dp[i - 2][0] + jumpEnergy[i - 2][1])
        dp[i][1] = minOf(minOf(dp[i - 1][1] + jumpEnergy[i - 1][0], dp[i - 2][1] + jumpEnergy[i - 2][1]), dp[i - 3][0] + k)
    }
    println(dp[n].min())
}