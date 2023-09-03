package _20100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val drink = StringTokenizer(readLine()).run { DoubleArray(n) { nextToken().toDouble() } }.sortedArrayDescending()
    var result = drink[0]
    for (i in 1 until n) {
        result += drink[i] / 2
    }
    println(result)
}