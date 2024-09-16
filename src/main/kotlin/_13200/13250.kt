package _13200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = DoubleArray(n + 1)
    dp[0] = 0.0
    dp[1] = 1.0
    for (i in 2..n) {
        for (j in 1..6) {
            dp[i] += if (i - j >= 0) dp[i - j] else 0.0
        }
        dp[i] /= 6.0
        dp[i] += 1.0
    }
    println(dp[n])
}