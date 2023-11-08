package _12800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val sum = LongArray(n + 1)
    StringTokenizer(readLine()).apply { repeat(n) { sum[it + 1] = sum[it] + nextToken().toLong() } }
    var max = 0L
    for (i in m..n) {
        max = maxOf(max, sum[i] - sum[i - m])
    }
    println(max)
}