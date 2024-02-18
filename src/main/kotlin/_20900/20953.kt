package _20900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.`out`.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = StringTokenizer(readLine()).run { nextToken().toInt() + nextToken().toInt() }
        bw.write("${n * (n * (n - 1) / 2)}")
        bw.newLine()
    }
    bw.close()
}