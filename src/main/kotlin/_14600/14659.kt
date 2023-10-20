package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var max = 0
    for (i in 0 until n) {
        var count = 0
        for (j in i + 1 until n) {
            if (arr[i] > arr[j]) {
                count++
            } else {
                break
            }
        }
        max = maxOf(max, count)
    }
    println(max)
}