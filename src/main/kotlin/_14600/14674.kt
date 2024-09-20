package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val games = Array(n) { StringTokenizer(readLine()).run { Game(nextToken().toInt(), nextToken().toLong(), nextToken().toLong()) } }.sortedArray()
    println(games.slice(0..<k).joinToString("\n") { "${it.i}" })
}

private class Game(val i: Int, val c: Long, val h: Long) : Comparable<Game> {
    override fun compareTo(other: Game) = when {
        other.h * c > h * other.c -> 1
        other.h * c < h * other.c -> -1
        else -> if (c == other.c) i - other.i else c.compareTo(other.c)
    }
}