package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        bw.write("${StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.sum() }}")
        bw.newLine()
    }
    bw.close()
}