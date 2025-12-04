package _33500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var width = 0L
    var height = 0L
    repeat(n) {
        val (min, max) = StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } }.apply { sort() }
        width = maxOf(width, min)
        height = maxOf(height, max)
    }
    println(width * height)
}