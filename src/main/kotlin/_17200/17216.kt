package _17200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = a.copyOf()
    for (i in 1..<n) {
        for (j in 0..<i) {
            if (a[j] > a[i]) {
                dp[i] = maxOf(dp[i], dp[j] + a[i])
            }
        }
    }
    println(dp.max())
}