package _29100

import java.util.StringTokenizer
import kotlin.math.atan2

fun main() = with(System.`in`.bufferedReader()) {
    val atan2 = mutableSetOf<Double>()
    repeat(readLine().toInt()) {
        val (x, y) = StringTokenizer(readLine()).run { DoubleArray(2) { nextToken().toDouble() } }
        atan2.add(atan2(y, x))
    }
    println(atan2.size)
}