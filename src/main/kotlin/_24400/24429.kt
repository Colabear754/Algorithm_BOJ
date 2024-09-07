package _24400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val matrix = Array(n + 1) { IntArray(n + 1) }
    for (i in 1..n) {
        StringTokenizer(readLine()).apply { for (j in 1..n) matrix[i][j] = nextToken().toInt() }
    }
    val p = readLine().toInt()
    val destinations = Array(p) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } } + arrayOf(intArrayOf(n, n))
    destinations.sortWith(compareBy({ it[0] }, { it[1] }))
    for (i in 0..<p - 1) {
        if (destinations[i][1] > destinations[i + 1][1]) {
            println(-1)
            return@with
        }
    }
    val dp = Array(n + 1) { IntArray(n + 1) }
    dp[1][1] = matrix[1][1]
    var r = 1
    var c = 1
    for (destination in destinations) {
        val (nr, nc) = destination
        for (i in r..nr) {
            for (j in c..nc) {
               dp[i][j] = maxOf(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j]
            }
        }
        r = nr
        c = nc
    }
    println(dp[n][n])
}