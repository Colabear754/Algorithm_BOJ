package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String?
    while (!readLine().also { input = it }.isNullOrEmpty()) {
        val (a, b, c) = StringTokenizer(input).run { IntArray(3) { nextToken().toInt() } }
        bw.write("${maxOf(b - a, c - b) - 1}")
        bw.newLine()
    }
    bw.close()
}