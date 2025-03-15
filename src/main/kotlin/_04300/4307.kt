package _04300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (l, n) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        var min = 0
        var max = 0
        repeat(n) {
            val x = readLine().toInt()
            min = maxOf(min, minOf(x, l - x))
            max = maxOf(max, maxOf(x, l - x))
        }
        bw.write("$min $max\n")
    }
    bw.close()
}