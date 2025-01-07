package _23200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, l, h) = readLine().split(' ').map { it.toInt() }
    val scores = StringTokenizer(readLine()).run { DoubleArray(n) { nextToken().toDouble() } }.sortedArray()
    println(scores.slice(l..<(n - h)).average())
}