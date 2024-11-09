package _23800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val b = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    for (i in n - 1 downTo 1) {
        if (a.contentEquals(b)) {
            println(1)
            return@with
        }
        var max = 0
        var maxIndex = 0
        for (j in 0..i) {
            if (a[j] > max) {
                max = a[j]
                maxIndex = j
            }
        }
        if (maxIndex != i) a[i] = max.also { a[maxIndex] = a[i] }
    }
    println(if (a.contentEquals(b)) 1 else 0)
}