package _28000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    println(maxOf(0, StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() - n + it } }.max()))
}