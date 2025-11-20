package _25400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var expected = 1
    for (number in array) {
        if (number == expected) expected++
    }
    println(n - expected + 1)
}