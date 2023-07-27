package _02700

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val a = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    val (k, l) = readLine().split(' ').map(String::toInt)
    val b = Array(k) { StringTokenizer(readLine()).run { IntArray(l) { nextToken().toInt() } } }
    val result = Array(n) { IntArray(l) }
    for (i in 0 until n) {
        for (j in 0 until l) {
            for (t in 0 until m) {
                result[i][j] += a[i][t] * b[t][j]
            }
        }
    }
    println(result.joinToString("\n") { it.joinToString(" ") })
}