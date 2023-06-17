package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var minX = Int.MAX_VALUE
    var maxX = Int.MIN_VALUE
    var minY = Int.MAX_VALUE
    var maxY = Int.MIN_VALUE
    repeat(n) {
        val (x, y) = StringTokenizer(readLine()).run { Pair(nextToken().toInt(), nextToken().toInt()) }
        minX = minOf(minX, x)
        maxX = maxOf(maxX, x)
        minY = minOf(minY, y)
        maxY = maxOf(maxY, y)
    }
    println((maxX - minX) * (maxY - minY))
}