package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write(Array(readLine().toInt()) { StringTokenizer(readLine()).run { nextToken().toInt() to nextToken() } }.maxBy { it.first }.second)
        bw.newLine()
    }
    bw.close()
}