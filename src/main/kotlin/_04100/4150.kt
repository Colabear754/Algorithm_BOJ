package _04100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = Array(n + 1) { 0L.toBigInteger() }
    dp[1] = 1L.toBigInteger()
    for (i in 2..n) dp[i] = dp[i - 1] + dp[i - 2]
    println(dp[n])
}