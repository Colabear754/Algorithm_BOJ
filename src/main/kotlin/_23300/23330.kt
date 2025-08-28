package _23300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val x = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt()} }.apply { sort() }
    var result = 0L
    for (i in 0..<n) {
        (2L * i - n + 1L).also { if (it != 0L) result += x[i] * it }
    }
    println(result shl 1)
}