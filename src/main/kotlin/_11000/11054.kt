package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val increaseDp = IntArray(n)
    val decreaseDp = IntArray(n)
    for (i in arr.indices) {
        var max = 0
        for (j in 0 until i) {
            if (arr[i] > arr[j] && increaseDp[j] > max) max = increaseDp[j]
        }
        increaseDp[i] = max + 1
    }
    for (i in n - 1 downTo 0) {
        var max = 0
        for (j in n - 1 downTo i + 1) {
            if (arr[i] > arr[j] && decreaseDp[j] > max) max = decreaseDp[j]
        }
        decreaseDp[i] = max + 1
    }
    var max = 0
    for (i in arr.indices) {
        max = maxOf(max, increaseDp[i] + decreaseDp[i])
    }
    println(max - 1)
}