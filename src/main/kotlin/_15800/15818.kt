package _15800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var result = 1L
    StringTokenizer(readLine()).apply {
        while (hasMoreTokens()) {
            result *= nextToken().toLong()
            result %= m
        }
    }
    println(result % m)
}