package _13900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val woks = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
    val cases = mutableSetOf<Int>()
    woks.forEach { cases.add(it) }
    for (i in woks.indices) {
        for (j in i + 1..<woks.size) {
            if (woks[i] + woks[j] > n) continue
            cases.add(woks[i] + woks[j])
        }
    }
    val dp = IntArray(n + 1) { 10001 }
    cases.forEach { dp[it] = 1 }
    for (i in 1..n) {
        for (j in 1..<i) {
            dp[i] = minOf(dp[i], dp[j] + dp[i - j])
        }
    }
    println(if (dp[n] == 10001) -1 else dp[n])
}