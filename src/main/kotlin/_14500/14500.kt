package _14500

import java.util.StringTokenizer

private var max = 0

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    repeat(n) { x -> repeat(m) { y -> dfs(map, mutableListOf(Point(x, y, map[x][y]))) } }
    println(max)
}

private fun dfs(map: Array<IntArray>, points: MutableList<Point>) {
    if (points.size == 4) {
        max = maxOf(max, points.last().value)
        return
    }
    if (points.size == 2) {
        val point1 = points[0]
        val point2 = points[1]
        if (point1.x < point2.x && point2.x < map.size - 1) {
            if (point2.y > 0) max = maxOf(max, point2.value + map[point2.x + 1][point2.y] + map[point2.x][point2.y - 1])
            if (point2.y < map[0].size - 1) max = maxOf(max, point2.value + map[point2.x + 1][point2.y] + map[point2.x][point2.y + 1])
        } else if (point1.y < point2.y && point2.y < map[0].size - 1) {
            if (point2.x > 0) max = maxOf(max, point2.value + map[point2.x][point2.y + 1] + map[point2.x - 1][point2.y])
            if (point2.x < map.size - 1) max = maxOf(max, point2.value + map[point2.x][point2.y + 1] + map[point2.x + 1][point2.y])
        }
    }
    for (i in -1..1) {
        for (j in -1..1) {
            if (i * j != 0 || (i == 0 && j == 0)) continue
            val point = points.last()
            val x = point.x + i
            val y = point.y + j
            if (x < 0 || x >= map.size || y < 0 || y >= map[0].size) continue
            val newPoint = Point(x, y, point.value + map[x][y])
            var flag = true
            for (p in points) {
                if (newPoint.compareTo(p) == 0) {
                    flag = false
                    break
                }
            }
            if (!flag) continue
            points.add(newPoint)
            dfs(map, points)
            points.removeLast()
        }
    }
}

private class Point(val x: Int, val y: Int, val value: Int) : Comparable<Point> {
    override fun compareTo(other: Point) = if (x == other.x && y == other.y) 0 else -1
}