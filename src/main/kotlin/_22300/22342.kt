package _22300

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val d = Array(n) { readLine() }
    if (m == 1) return@with println(0)
    val dp = Array(n) { IntArray(m - 1) }
    for (i in 0..<n) {
        dp[i][0] = d[i][0] - '0'
    }
    for (j in 1..<m - 1) {
        for (i in 0..<n) {
            dp[i][j] = maxOf(
                if (i > 0) dp[i - 1][j - 1] else 0,
                dp[i][j - 1],
                if (i < n - 1) dp[i + 1][j - 1] else 0
            ) + (d[i][j] - '0')
        }
    }
    var result = 0
    for (i in 0..<n) {
        result = maxOf(result, dp[i].last())
    }
    println(result)
}