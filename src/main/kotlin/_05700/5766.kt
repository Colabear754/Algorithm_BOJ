package _05700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    while (true) {
        val rankPoint = IntArray(10001)
        val (n, m) = StringTokenizer(readLine().also { if (it == "0 0") return@with bw.close() }).run { IntArray(2) { nextToken().toInt() } }
        repeat(n) { StringTokenizer(readLine()).run { repeat(m) { rankPoint[nextToken().toInt()]++ } } }
        val second = rankPoint.sortedArrayDescending()[1]
        bw.write(rankPoint.indices.filter { rankPoint[it] == second }.joinToString(" "))
        bw.newLine()
    }
}