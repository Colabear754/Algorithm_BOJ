package _20200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, k, l) = readLine().split(' ').map { it.toInt() }
    var count = 0
    repeat(n) {
        val ratings = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        if (ratings.any { it < l }) return@repeat
        if (ratings.sum() < k) return@repeat
        count++
        sb.append(ratings.joinToString(" ")).append(' ')
    }
    println("$count\n$sb")
}