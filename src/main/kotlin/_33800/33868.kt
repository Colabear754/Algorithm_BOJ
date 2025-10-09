package _33800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var maxT = 0
    var minB = 5000
    repeat(n) { StringTokenizer(readLine()).apply {
        maxT = maxOf(maxT, nextToken().toInt())
        minB = minOf(minB, nextToken().toInt())
    } }
    println((maxT * minB) % 7 + 1)
}