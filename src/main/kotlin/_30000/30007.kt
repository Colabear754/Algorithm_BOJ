package _30000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val (a, b, x) = IntArray(3) { nextToken().toInt() }
            bw.write("${a * (x - 1) + b}\n")
        }
    }
    bw.close()
}