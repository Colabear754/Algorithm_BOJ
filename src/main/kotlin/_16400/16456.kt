package _16400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = LongArray(n)
    if (n in 1..2) return@with println(1)
    if (n == 3) return@with println(2)
    dp[0] = 1
    dp[1] = 1
    dp[2] = 2
    for (i in 3..<n) dp[i] = (dp[i - 1] + dp[i - 3]) % 1000000009
    println(dp.last())
}