package _02700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (index, str) = StringTokenizer(readLine()).run { nextToken().toInt() to nextToken() }
        bw.write("${str.substring(0, index - 1)}${str.substring(index)}\n")
    }
    bw.close()
}