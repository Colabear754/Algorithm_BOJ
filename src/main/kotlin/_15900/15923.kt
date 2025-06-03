package _15900

import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val coordinates = Array(n) { StringTokenizer(readLine()).run { DoubleArray(2) { nextToken().toDouble() } } }
    var perimeter = 0.0
    for (i in 0..<n) {
        val x1 = coordinates[i][0]
        val y1 = coordinates[i][1]
        val x2 = coordinates[(i + 1) % n][0]
        val y2 = coordinates[(i + 1) % n][1]
        perimeter += sqrt(((x2 - x1).pow(2) + (y2 - y1).pow(2)))
    }
    println(perimeter.toInt())
}