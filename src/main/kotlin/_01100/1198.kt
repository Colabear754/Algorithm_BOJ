package _01100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val points = List(n) { Coordinate(StringTokenizer(readLine())) }
    var max = 0
    for (i in 0..<n) {
        var k = (i + 2) % n
        for (j in i + 1..<n) {
            while (true) {
                val next = (k + 1) % n
                if (calculateArea(points[i], points[j], points[k]) >= calculateArea(points[i], points[j], points[next])) {
                    break
                }
                k = next
            }
            max = maxOf(max, calculateArea(points[i], points[j], points[k]))
        }
    }
    println(max / 2.0)
}

private fun calculateArea(a: Coordinate, b: Coordinate, c: Coordinate) =
    kotlin.math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y))

private class Coordinate(st: StringTokenizer) {
    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()
}