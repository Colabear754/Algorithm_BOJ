package _02200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val coins = HashSet<Int>().apply { repeat(n) { add(readLine().toInt()) } }.toIntArray()
    val dp = IntArray(k + 1) { 10001 }
    dp[0] = 0
    for (i in coins.indices) {
        for (j in coins[i]..k) {
            dp[j] = minOf(dp[j], dp[j - coins[i]] + 1)
        }
    }
    println(if (dp[k] == 10001) -1 else dp[k])
}