package _30000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var sum = 0
    repeat(readLine().toInt()) {
        sum += when (StringTokenizer(readLine()).nextToken().toInt()) {
            136 -> 1000
            142 -> 5000
            148 -> 10000
            else -> 50000
        }
    }
    println(sum)
}