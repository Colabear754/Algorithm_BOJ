package _17100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n + 1)
    dp[0] = 1
    if (n > 0) dp[1] = 1
    for (i in 2..dp.lastIndex) {
        dp[i] = (1 + dp[i - 1] + dp[i - 2]) % 1000000007
    }
    println(dp[n])
}