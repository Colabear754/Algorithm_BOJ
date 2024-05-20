package _18300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val soldiers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = IntArray(n) { 1 }
    for (i in 1..<n) {
        for (j in 0..<i) {
            if (soldiers[i] < soldiers[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }
    println(n - dp.max())
}