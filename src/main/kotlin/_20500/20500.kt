package _20500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = Array(n + 1) { IntArray(3) }
    if (n == 1) {
        println(0)
        return@with
    }
    dp[2][0] = 1
    dp[2][1] = 1
    for (i in 3..n) {
        dp[i][0] = (dp[i - 1][1] + dp[i - 1][2]) % 1000000007
        dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 1000000007
        dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 1000000007
    }
    println(dp[n][0])
}