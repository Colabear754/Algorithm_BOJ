package _10800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = Array(n + 1) { LongArray(10) }
    for (i in 1..9) {
        dp[1][i] = 1
    }
    for (i in 2..n) {
        for (j in 0..9) {
            dp[i][j] = when (j) {
                0 -> dp[i - 1][1] % 1000000000
                9 -> dp[i - 1][8] % 1000000000
                else -> (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000
            }
        }
    }
    var sum = 0L
    for (i in 0..9) {
        sum = (sum + dp[n][i]) % 1000000000
    }
    println(sum)
}