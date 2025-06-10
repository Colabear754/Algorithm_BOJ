package _02900

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    fun coordinate() = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
    val triangle = Array(3) { coordinate() }
    val n = readLine().toInt()
    val points = Array(n) { coordinate() }
    val area = triangle.let { abs((it[0][0] * (it[1][1] - it[2][1]) + it[1][0] * (it[2][1] - it[0][1]) + it[2][0] * (it[0][1] - it[1][1])) / 2.0) }
    println("$area\n${points.count { p -> isInTriangle(triangle, p) }}")
}

private fun isInTriangle(triangle: Array<IntArray>, point: IntArray): Boolean {
    val (a, b, c) = triangle
    val ab = ccw(a, b, point)
    val bc = ccw(b, c, point)
    val ca = ccw(c, a, point)
    if ((ab > 0 && bc > 0 && ca > 0) || (ab < 0 && bc < 0 && ca < 0)) return true
    if (onSegment(a, b, point) || onSegment(b, c, point) || onSegment(c, a, point)) return true
    return false
}

private fun onSegment(a: IntArray, b: IntArray, point: IntArray): Boolean {
    return ccw(a, b, point) == 0 &&
            point[0] in minOf(a[0], b[0])..maxOf(a[0], b[0]) &&
            point[1] in minOf(a[1], b[1])..maxOf(a[1], b[1])
}

private fun ccw(a: IntArray, b: IntArray, c: IntArray): Int {
    return (b[0] - a[0]) * (c[1] - a[1]) - (b[1] - a[1]) * (c[0] - a[0])
}