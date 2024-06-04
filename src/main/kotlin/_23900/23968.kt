package _23900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var count = 0
    for (i in n - 1 downTo 1) {
        for (j in 0..<i) {
            if (arr[j] > arr[j + 1]) {
                arr[j] = arr[j + 1].also { arr[j + 1] = arr[j] }
                if (++count == k) {
                    println("${arr[j]} ${arr[j + 1]}")
                    return@with
                }
            }
        }
    }
    println(-1)
}