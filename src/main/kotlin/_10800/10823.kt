package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val input = StringBuilder()
    var line: String?
    while (!readLine().also { line = it }.isNullOrEmpty()) {
        input.append(line)
    }
    var sum = 0
    StringTokenizer(input.toString(), ",").run { while (hasMoreTokens()) sum += nextToken().toInt() }
    println(sum)
}