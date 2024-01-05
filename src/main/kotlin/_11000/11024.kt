package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { bw.write("${StringTokenizer(readLine()).run { IntArray(countTokens()) { nextToken().toInt() }.sum() }}\n") }
    bw.close()
}