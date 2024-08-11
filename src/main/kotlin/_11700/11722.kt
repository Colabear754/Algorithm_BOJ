package _11700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val partial = IntArray(n)
    var result = 0
    for (i in 0..<n) {
        val index = partial.binarySearch(arr[n - 1 - i], 0, result)
        if (index < 0) {
            partial[-index - 1] = arr[n - 1 - i]
            if (-index - 1 == result) result++
        }
    }
    println(result)
}
