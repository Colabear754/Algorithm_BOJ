package _25500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val subscribers = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    var count = 0
    for (i in 1..<n) {
        var difference = 0
        repeat(m) { difference += kotlin.math.abs(subscribers[0][it] - subscribers[i][it]) }
        if (difference > 2000) count++
    }
    println(if (count * 2 >= n - 1) "YES" else "NO")
}