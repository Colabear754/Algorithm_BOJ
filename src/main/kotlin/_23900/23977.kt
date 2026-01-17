package _23900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (k, n) = readLine().split(" ").map { it.toInt() }
    val array = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    println(array.fold(1L) { acc, i -> lcm(acc, i) } - k)
}

private fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)
private fun lcm(a: Long, b: Long): Long = a * b / gcd(a, b)