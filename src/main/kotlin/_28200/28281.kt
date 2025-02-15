package _28200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, x) = readLine().split(' ').map { it.toInt() }
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var min = Int.MAX_VALUE
    for (i in 1..<n) {
        min = minOf(min, x * (a[i] + a[i - 1]))
    }
    println(min)
}