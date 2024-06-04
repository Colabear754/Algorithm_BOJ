package _17900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val testPaper = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var left = 0
    var right = testPaper.sum()
    while (left <= right) {
        val mid = (left + right) / 2
        var count = 0
        var sum = 0
        for (solve in testPaper) {
            sum += solve
            if (sum >= mid) {
                count++
                sum = 0
            }
        }
        if (count < k) right = mid - 1
        else left = mid + 1
    }
    println(right)
}