package _05200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("Distances: ")
        val (a, b) = StringTokenizer(readLine()).run { nextToken() to nextToken() }
        for (i in a.indices) {
            (b[i] - a[i]).let { if (it < 0) it + 26 else it }.let { bw.write("$it ") }
        }
        bw.newLine()
    }
    bw.close()
}