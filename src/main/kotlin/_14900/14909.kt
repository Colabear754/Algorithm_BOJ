package _14900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var count = 0
    StringTokenizer(readLine()).apply { while (hasMoreTokens()) if (nextToken().toInt() > 0) count++ }
    println(count)
}