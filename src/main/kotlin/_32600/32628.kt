package _32600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val a = LongArray(n + 1)
    val b = LongArray(n + 1)
    StringTokenizer(readLine()).apply { repeat(n) { a[it + 1] = nextToken().toLong() + a[it] } }
    StringTokenizer(readLine()).apply { repeat(n) { b[it + 1] = nextToken().toLong() + b[it] } }
    var min = Long.MAX_VALUE
    for (i in 0..n) {
        val next = 2 * n - k - i
        if (next !in 0..n) continue
        min = minOf(min, maxOf(a[i], b[next]))
    }
    println(min)
}