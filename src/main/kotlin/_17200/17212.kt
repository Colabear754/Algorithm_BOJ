package _17200

fun main() = with(System.`in`.bufferedReader()) {
    val money = readLine().toInt()
    val dp = IntArray(money + 1)
    for (i in 1..money) {
        dp[i] = dp[i - 1] + 1
        if (i >= 2) dp[i] = minOf(dp[i], dp[i - 2] + 1)
        if (i >= 5) dp[i] = minOf(dp[i], dp[i - 5] + 1)
        if (i >= 7) dp[i] = minOf(dp[i], dp[i - 7] + 1)
    }
    println(dp[money])
}