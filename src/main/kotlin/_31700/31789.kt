package _31700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (x, s) = readLine().split(' ').map { it.toInt() }
    var max = 0
    repeat(n) {
        val (c, p) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        if (c <= x) max = maxOf(max, p)
    }
    println(if (max > s) "YES" else "NO")
}