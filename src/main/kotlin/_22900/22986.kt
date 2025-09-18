package _22900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, k) = StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } }
        val min = minOf(n, k)
        bw.appendLine("${4 * (min + 1) * (2 * n - min) / 2}")
    }
    bw.close()
}