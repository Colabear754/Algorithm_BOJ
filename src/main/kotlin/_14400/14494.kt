package _14400

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val dp = Array(n + 1) { LongArray(m + 1) }
    dp[1][1] = 1
    for (i in 1..n) {
        for (j in 1..m) {
            if (i == 1 && j == 1) continue
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1] + dp[i - 1][j - 1]) % 1000000007
        }
    }
    println(dp[n][m])
}