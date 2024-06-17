package _03100

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toInt() }
    val bookmarks = IntArray(readLine().toInt()) { readLine().toInt() }
    var current = a
    bookmarks.forEach { if (abs(b - current) > abs(b - it)) current = it }
    println(abs(b - current) + if (a != current) 1 else 0)
}