package _32100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sum = LongArray(n + 1)
    val s = LongArray(1) + StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong().apply { sum[it + 1] = sum[it] + this@apply } } }
    var max = Long.MIN_VALUE
    for (i in 1..n) {
        max = maxOf(max, 2 * s[i] - sum[i])
    }
    println(max)
}