package _31700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        bw.appendLine("${maxOf(a, (b + 3) / 4).let { it - a + maxOf(b, 3 * it) - b }}")
    }
    bw.close()
}