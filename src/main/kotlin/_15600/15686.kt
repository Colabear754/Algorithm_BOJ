package _15600

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val chickens = ArrayList<Coordinate>()
    val houses = ArrayList<Coordinate>()
    repeat(n) { r ->
        StringTokenizer(readLine()).run {
            repeat(n) { c ->
                when (nextToken()) {
                    "1" -> houses.add(Coordinate(r, c))
                    "2" -> chickens.add(Coordinate(r, c))
                }
            }
        }
    }
    val opened = BooleanArray(chickens.size)
    var min = Int.MAX_VALUE
    fun dfs(depth: Int, count: Int) {
        if (count == m) {
            var totalDistance = 0
            for (i in houses.indices) {
                var minDistance = Int.MAX_VALUE
                for (j in chickens.indices) {
                    if (opened[j]) minDistance = minOf(minDistance, houses[i].distance(chickens[j]))
                }
                totalDistance += minDistance
            }
            min = minOf(min, totalDistance)
            return
        }
        for (i in depth..<chickens.size) {
            opened[i] = true
            dfs(i + 1, count + 1)
            opened[i] = false
        }
    }
    dfs(0, 0)
    println(min)
}

private class Coordinate(val r: Int, val c: Int) {
    fun distance(other: Coordinate) = abs(r - other.r) + abs(c - other.c)
}