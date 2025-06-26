package _01000

import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ").map { it.toDouble() }
    val p1 = Point(input[0], input[1])
    val p2 = Point(input[2], input[3])
    val p3 = Point(input[4], input[5])
    if ((p3.y - p2.y) * (p2.x - p1.x) == (p2.y - p1.y) * (p3.x - p2.x)) {
        println(-1)
        return@with
    }

    val sides = arrayOf(distance(p1, p2), distance(p1, p3), distance(p2, p3)).sortedArray()
    println((sides[2] - sides[0]) * 2)
}

private fun distance(p1: Point, p2: Point) = sqrt((p1.x - p2.x).pow(2) + (p1.y - p2.y).pow(2))
private class Point(val x: Double, val y: Double)