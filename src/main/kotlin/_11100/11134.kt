package _11100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("${StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() }.let { (a, b) -> (a + b - 1) / b }}}")
        bw.newLine()
    }
    bw.close()
}