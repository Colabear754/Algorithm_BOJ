package _01500

import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val s = readLine().split(" ").map { it.toDouble() }
//    val M = s.max()
    var M = 0.0
    for (a in s) {
        M = max(M, a)
    }
    var sum = 0.0
    for (a in s) {
        sum += a / M * 100
    }
    println(sum / n)
}