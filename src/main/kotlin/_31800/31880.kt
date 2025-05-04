package _31800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var result = 0L
    StringTokenizer(readLine()).run { repeat(n) { result += nextToken().toLong() } }
    StringTokenizer(readLine()).run { repeat(m) { nextToken().toLong().let { if (it > 0) result *= it } } }
    println(result)
}