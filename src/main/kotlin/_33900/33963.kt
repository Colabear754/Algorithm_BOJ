package _33900

import kotlin.math.log10

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toDouble()
    val length = log10(n).toInt() + 1
    var count = 0
    while (log10(n * 2).toInt() + 1 == length) {
        n *= 2
        count++
    }
    println(count)
}