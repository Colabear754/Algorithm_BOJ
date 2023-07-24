package _02100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val wine = IntArray(1) + IntArray(n) { readLine().toInt() }
    val dp = IntArray(n + 1)
    dp[1] = wine[1]
    if (n > 1) {
        dp[2] = wine[2] + wine[1]
        for (i in 3..n) {
            dp[i] = maxOf(dp[i - 1], dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i])
        }
    }
    println(dp[n])
}