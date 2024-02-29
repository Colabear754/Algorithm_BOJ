package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var result = 0
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }.let { result += it[1] % it[0] }
    }
    println(result)
}