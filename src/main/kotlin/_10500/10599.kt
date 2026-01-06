package _10500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String
    while (readLine().also { input = it } != "0 0 0 0") {
        val (a, b, c, d) = StringTokenizer(input).run { IntArray(4) { nextToken().toInt() } }
        bw.appendLine("${c - b} ${d - a}")
    }
    bw.close()
}