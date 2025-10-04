package _31700

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c) = readLine().split(' ').map { it.toInt() }
    if (c == 0) return@with println(sqrt((a + b).toDouble()).toInt())
    println(c * c - maxOf(a, b))
}