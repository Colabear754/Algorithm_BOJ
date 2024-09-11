package _31400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numbers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.filter { it != 0 }
    if (numbers.isEmpty()) {
        println("YES\n0")
        return@with
    }
    println("YES\n${numbers[0]}${numbers[0]}${numbers[0]}")
}