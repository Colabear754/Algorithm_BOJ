package _01000

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (min, max) = readLine().split(" ").map { it.toLong() }
    val check = BooleanArray((max - min + 1).toInt())
    val maxSqrt = sqrt(max.toDouble()).toLong()
    for (i in 2..maxSqrt) {
        val pow = i * i
        val start = min / (i * i)

        var j = start
        while (j * pow <= max) {
            if (j * pow >= min) {
                check[(j * pow - min).toInt()] = true
            }
            j++
        }
    }
    println(check.count { b -> !b })
}