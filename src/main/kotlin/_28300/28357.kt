package _28300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').let { (a, b) -> a.toInt() to b.toLong() }
    val scores = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }.sortedArray()
    var min = 0L
    var max = scores.last()
    while (min < max) {
        val mid = (min + max) / 2
        var count = 0L
        scores.forEach { count += maxOf(0, it - mid) }
        if (count > k) min = mid + 1
        else max = mid
    }
    println(min)
}