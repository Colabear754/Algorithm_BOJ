package _17400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val distances = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    var result = distances.last()
    for (i in n - 2 downTo 0) {
        result = distances[i] * ((result + distances[i] - 1) / distances[i])
    }
    println(result)
}