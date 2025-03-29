package _02300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val vips = IntArray(readLine().toInt()) { readLine().toInt() }
    val dp = IntArray(n + 1)
    dp[0] = 1
    dp[1] = 1
    for (i in 2..n) dp[i] = dp[i - 1] + dp[i - 2]
    var result = 1
    var prev = 0
    for (vip in vips) {
        result *= dp[vip - prev - 1]
        prev = vip
    }
    println(result * dp[n - prev])
}