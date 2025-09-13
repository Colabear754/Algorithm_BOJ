package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val scores = StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } }.apply { sort() }
        bw.appendLine(if (scores[3] - scores[1] >= 4) "KIN" else "${scores[1] + scores[2] + scores[3]}")
    }
    bw.close()
}