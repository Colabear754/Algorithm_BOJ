package _25900

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val percentage = DoubleArray(10) { readLine().toDouble() }.sortedArray()
    println(percentage.sliceArray(1..9).reduce(Double::times) / (9.0 * 8.0 * 7.0 * 6.0 * 5.0 * 4.0 * 3.0 * 2.0) * 10.0.pow(9))
}