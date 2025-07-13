package _14700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0
    repeat(n) {
        val (c, k) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        sum += (c * k)
    }
    println(sum)
}