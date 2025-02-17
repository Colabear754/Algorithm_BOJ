package _15700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val helmetMax = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.max() }
    val vestMax = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() }.max() }
    println(helmetMax + vestMax)
}