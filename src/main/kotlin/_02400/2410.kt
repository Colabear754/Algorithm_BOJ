package _02400

fun main() = with(System.`in`.bufferedReader()) {
    val dp = LongArray(readLine().toInt() + 1)
    dp[1] = 1
    if (dp.size > 2) dp[2] = 2
    for (i in 3..dp.lastIndex) {
        if (i % 2 == 1) dp[i] = dp[i - 1]
        else dp[i] = (dp[i - 1] + dp[i / 2]) % 1000000000
    }
    println(dp.last())
}