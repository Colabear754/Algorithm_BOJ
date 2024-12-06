package _16400

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val dp = IntArray(n + 1) { -1 }
    dp[0] = 0
    for (i in 1..m) {
        val (days, pages) = readLine().split(' ').map { it.toInt() }
        for (j in n downTo 0) {
            if (dp[j] != -1 && j + days <= n) {
                dp[j + days] = maxOf(dp[j + days], dp[j] + pages)
            }
        }
    }
    println(dp.max())
}