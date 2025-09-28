package _02700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var min = StringTokenizer(readLine()).run { nextToken().toDouble() / nextToken().toDouble() }
    repeat(readLine().toInt()) {
        min = minOf(min, StringTokenizer(readLine()).run { nextToken().toDouble() / nextToken().toDouble() })
    }
    println(min * 1000)
}