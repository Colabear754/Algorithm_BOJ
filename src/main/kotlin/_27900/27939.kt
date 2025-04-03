package _27900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val breeds = StringTokenizer(readLine()).run { BooleanArray(n) { nextToken() == "P" } }
    val (m, _) = readLine().split(' ').map { it.toInt() }
    repeat(m) {
        StringTokenizer(readLine()).run { while (hasMoreTokens()) if (breeds[nextToken().toInt() - 1]) return@repeat }
        return@with println("W")
    }
    println("P")
}