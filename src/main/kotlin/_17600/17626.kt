package _17600

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n + 1) { Int.MAX_VALUE }
    dp[0] = 0
    val squareNumbers = IntArray(sqrt(n.toDouble()).toInt()) { (it + 1) * (it + 1) }
    for (i in dp.indices) {
        for (sn in squareNumbers) {
            if (i + sn <= n) dp[i + sn] = minOf(dp[i + sn], dp[i] + 1)
        }
    }
    println(dp[n])
}