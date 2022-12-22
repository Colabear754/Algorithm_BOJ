package _12800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val dp = IntArray(k + 1) { -1 }
    dp[0] = 0
    for (i in 1..n) {
        val (weight, value) = readLine().split(' ').map { it.toInt() }
        for (j in k downTo 0) {
            if (dp[j] != -1 && j + weight <= k) {
                dp[j + weight] = maxOf(dp[j + weight], dp[j] + value)
            }
        }
    }
    println(dp.max())
}