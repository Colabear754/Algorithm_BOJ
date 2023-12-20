package _23800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n + 1)
    val sum = LongArray(n + 1)
    StringTokenizer(readLine()).apply {
        for (i in 1..n) {
            arr[i] = nextToken().toInt()
            sum[i] = sum[i - 1] + arr[i]
        }
    }
    var result = 0L
    for (i in 1..n) {
        result += (arr[i] * (sum[n] - sum[i])) % 1000000007
    }
    println(result % 1000000007)
}