package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = array.copyOf()
    for (i in 1..<n) {
        for (j in 0..<i) {
            if (array[i] > array[j]) {
                dp[i] = maxOf(dp[i], dp[j] + array[i])
            }
        }
    }
    println(dp.max())
}