package _06000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    for (i in 1..readLine().toInt()) {
        val (m, n, x, y) = StringTokenizer(readLine()).run { listOf(nextToken().toInt(), nextToken().toInt(), nextToken().toInt(), nextToken().toInt()) }
        var year = x
        val check = y % n
        while (year <= m * n && year % n != check) {
            year += m
        }
        bw.write(if (year > m * n) "-1\n" else "$year\n")
    }
    bw.close()
}