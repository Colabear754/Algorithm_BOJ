package _17900

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toInt() }
    val d = sqrt((a * a - b).toDouble()).toInt()
    if (d == 0) {
        println(-a)
        return@with
    }
    println("${-a - d} ${-a + d}")
}