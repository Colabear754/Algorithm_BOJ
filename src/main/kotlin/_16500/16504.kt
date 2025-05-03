package _16500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0L
    repeat(n) { StringTokenizer(readLine()).run { repeat(n) { sum += nextToken().toLong() } } }
    println(sum)
}