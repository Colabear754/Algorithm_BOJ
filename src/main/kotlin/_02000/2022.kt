package _02000

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (x, y, c) = readLine().split(' ').map { it.toDouble() }
    var left = 0.0
    var right = minOf(x, y)
    var mid = 0.0
    while (right - left > 0.001) {
        mid = (left + right) / 2
        val h1 = sqrt(x * x - mid * mid)
        val h2 = sqrt(y * y - mid * mid)
        if ((h1 * h2) / (h1 + h2) > c) {
            left = mid
        } else {
            right = mid
        }
    }
    println("%.3f".format(mid))
}