package _32500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var sum = a.sum()
    if (sum < m) return@with println(-1)
    for (i in 1..n) {
        sum -= a[i - 1]
        if (sum < m) {
            return@with println(i)
        }
    }
}