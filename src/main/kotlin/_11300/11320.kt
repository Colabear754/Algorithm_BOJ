package _11300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        bw.appendLine("${a * a / (b * b)}")
    }
    bw.close()
}