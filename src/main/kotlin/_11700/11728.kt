package _11700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val b = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
    println((a + b).sortedArray().joinToString(" "))
}