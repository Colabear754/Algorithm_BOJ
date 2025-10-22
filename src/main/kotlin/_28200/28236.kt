package _28200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    var result = 0
    var min = Int.MAX_VALUE
    for (i in 1..k) {
        val (f, d) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        val distance = f + m - d
        if (distance < min) {
            min = distance
            result = i
        }
    }
    println(result)
}