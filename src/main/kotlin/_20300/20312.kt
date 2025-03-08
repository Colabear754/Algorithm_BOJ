package _20300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    var result = 0L
    var prev = 0L
    StringTokenizer(readLine()).run {
        repeat(countTokens()) {
            result += ((prev + 1) * nextToken().toLong() % 1000000007).also { prev = it }
            result %= 1000000007
        }
    }
    println(result)
}