package _10200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val score = Array(9) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
        val yonsei = score.sumOf { it[0] }
        val korea = score.sumOf { it[1] }
        bw.write("${if (yonsei > korea) "Yonsei" else if (yonsei < korea) "Korea" else "Draw"}\n")
    }
    bw.close()
}