package _34000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, m, l) = readLine().split(' ').map { it.toInt() }
        var max = l
        StringTokenizer(readLine()).apply { repeat(n) { nextToken().toInt().let { if (it >= 0) max = maxOf(max, m - it) } } }
        bw.appendLine("The scoreboard has been frozen with $max ${if (max == 1) "minute" else "minutes"} remaining.")
    }
    bw.close()
}