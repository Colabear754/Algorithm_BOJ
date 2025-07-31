package _33900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 601
    repeat(n) {
        val sum = StringTokenizer(readLine()).run { nextToken().toInt() + nextToken().toInt() + nextToken().toInt() }
        if (sum >= 512) result = minOf(result, sum)
    }
    println(if (result == 601) -1 else result)
}