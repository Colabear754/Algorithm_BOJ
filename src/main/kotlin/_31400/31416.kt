package _31400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (ta, tb, va, vb) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
        var time = Int.MAX_VALUE
        for (i in 0..va) {
            time = minOf(time, maxOf((va - i) * ta, vb * tb + i * ta))
        }
        bw.write("$time")
        bw.newLine()
    }
    bw.close()
}