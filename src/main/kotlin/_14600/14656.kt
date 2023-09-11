package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var count = 0
    StringTokenizer(readLine()).run { repeat(n) { if (it + 1 != nextToken().toInt()) count++ } }
    println(count)
}