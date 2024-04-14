package _10900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val arr = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = Array(n + 1) { BooleanArray(n + 1) }
    for (i in 1..n) {
        dp[i][i] = true
        if (arr[i - 1] == arr[i]) {
            dp[i - 1][i] = true
        }
    }
    for (i in 2..<n) {
        for (j in 1..n - i) {
            val next = j + i
            if (arr[j] == arr[next] && dp[j + 1][next - 1]) {
                dp[j][next] = true
            }
        }
    }
    repeat(readLine().toInt()) {
        val (s, e) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        bw.write("${if (dp[s][e]) 1 else 0}\n")
    }
    bw.close()
}