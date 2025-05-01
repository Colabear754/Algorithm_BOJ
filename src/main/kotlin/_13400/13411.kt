package _13400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val robots = Array(n) { StringTokenizer(readLine()).run { Robot(it + 1, nextToken().toLong(), nextToken().toLong(), nextToken().toLong()) } }
        .apply { sort() }
    println(robots.joinToString("\n") { "${it.index}" })
}

private class Robot(val index: Int, val x: Long, val y: Long, val missile: Long) : Comparable<Robot> {
    override fun compareTo(other: Robot): Int {
        val time = (x * x + y * y) * other.missile * other.missile
        val otherTime = (other.x * other.x + other.y * other.y) * missile * missile
        return time.compareTo(otherTime)
    }
}