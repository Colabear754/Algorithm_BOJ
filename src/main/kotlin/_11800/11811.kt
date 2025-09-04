package _11800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val result = IntArray(n) {
        var value = 0
        for (i in array.indices) if (it != i) value = value or array[it][i]
        value
    }
    println(result.joinToString(" "))
}