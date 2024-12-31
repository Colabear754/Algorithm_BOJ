package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var max = 0
    var sum = 0
    StringTokenizer(readLine()).run { repeat(n) { sum += nextToken().toInt().also { max = maxOf(max, it) } } }
    println(sum - max)
}