package _21900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val scoreMap = HashMap<String, Int>().also { map ->
        repeat(readLine().toInt()) {
            StringTokenizer(readLine()).apply { map[nextToken()] = nextToken().toInt() }
        }
    }
    val length = str.length
    val dp = IntArray(length + 1)
    for (i in 1..length) {
        for (j in 1..i) {
            dp[i] = maxOf(dp[i], scoreMap[str.substring(j - 1, i)]?.plus(dp[j - 1]) ?: (dp[i - 1] + 1))
        }
    }
    println(dp[length])
}