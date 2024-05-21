package _31400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, s) = StringTokenizer(readLine()).run { nextToken().toInt() to nextToken() }
    var count = 0
    repeat(n) {
        val (name, quantity) = StringTokenizer(readLine()).run { nextToken() to nextToken().toInt() }
        StringTokenizer(name, "_").apply {
            while (hasMoreTokens()) {
                if (nextToken() == s) {
                    count += quantity
                    return@repeat
                }
            }
        }
    }
    println(count)
}