package _31900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, x) = readLine().split(' ').map { it.toInt() }
    val buses = List(n) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
    var latest = -1
    buses.forEach { (start, end) -> if (start + end <= x) latest = maxOf(latest, start) }
    println(latest)
}