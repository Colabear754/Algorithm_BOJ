package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    println(StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.sorted()[k - 1] })
}