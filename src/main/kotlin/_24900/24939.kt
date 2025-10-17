package _24900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toLong() }
    var xStart = 1L
    var xEnd = n
    var yStart = 1L
    var yEnd = m
    repeat(readLine().toInt()) {
        val (x, y, direction) = StringTokenizer(readLine()).run { LongArray(3) { nextToken().toLong() } }
        when (direction) {
            1L, 2L -> {
                yStart = y
                yEnd = y
                if (direction == 1L) xStart = maxOf(xStart, x + 1) else xEnd = minOf(xEnd, x - 1)
            }
            3L, 4L -> {
                xStart = x
                xEnd = x
                if (direction == 3L) yEnd = minOf(yEnd, y - 1) else yStart = maxOf(yStart, y + 1)
            }
            5L, 6L -> {
                yStart = maxOf(yStart, y + 1)
                if (direction == 5L) xStart = maxOf(xStart, x + 1) else xEnd = minOf(xEnd, x - 1)
            }
            7L, 8L -> {
                yEnd = minOf(yEnd, y - 1)
                if (direction == 7L) xStart = maxOf(xStart, x + 1) else xEnd = minOf(xEnd, x - 1)
            }
            9L -> return@with println(1)
        }
    }
    println((xEnd - xStart + 1) * (yEnd - yStart + 1))
}