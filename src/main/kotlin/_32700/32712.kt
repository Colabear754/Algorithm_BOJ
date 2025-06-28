package _32700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val dial = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    var result = 0L
    var score = 0L
    for (i in 0..<minOf(n, k)) {
        result = maxOf(result, score + dial[i] * (k - i))
        score += dial[i]
    }
    score = 0L
    for (i in n - 1 downTo maxOf(0, n - k)) {
        result = maxOf(result, score + dial[i] * (i - (n - k) + 1))
        score += dial[i]
    }
    println(result)
}