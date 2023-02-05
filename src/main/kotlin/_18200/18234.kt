package _18200

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(' ').map { it.toInt() }
    val carrots = Array(n) { StringTokenizer(readLine()).run { listOf(nextToken().toLong(), nextToken().toLong()) } }.sortedWith { o1, o2 -> o1[1].toInt() - o2[1].toInt() }
    var result = 0L
    var days = t - n
    for ((w, p) in carrots) {
        result += (w + p * days++)
    }
    println(result)
}