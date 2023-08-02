package _12000

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val lis = IntArray(n)
    var size = 0
    for (i in 0 until n) {
        val index = lis.binarySearch(arr[i], 0, size)
        if (index < 0) {
            lis[-index - 1] = arr[i]
            if (-index - 1 == size) size++
        }
    }
    println(size)
}