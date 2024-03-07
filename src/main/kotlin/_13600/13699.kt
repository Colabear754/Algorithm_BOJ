package _13600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = LongArray(n + 1)
    dp[0] = 1
    for (i in 1..n) {
        for (j in 0..<i) {
            dp[i] += dp[j] * dp[i - j - 1]
        }
    }
    println(dp[n])
}