package _28100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, x) = readLine().split(" ").map { it.toLong() }
    val prices = StringTokenizer(readLine()).run { IntArray(m.toInt()) { nextToken().toInt() } }
    val counts = LongArray(m.toInt())
    var current = x - n * prices.last()
    var remaining = n
    var index = 0
    while (index < m - 1 && current > 0 && remaining > 0) {
        val maxIndex = prices.binarySearchFirst(index, current + prices.last())
        if (maxIndex == -1) break
        val picked = prices[maxIndex] - prices.last()
        val count = minOf(remaining, current / picked)
        counts[maxIndex] = count
        remaining -= count
        current -= count * picked
        index = maxIndex + 1
    }
    counts[m.toInt() - 1] += remaining
    println(counts.joinToString(" "))
}

private fun IntArray.binarySearchFirst(from: Int, target: Long): Int {
    var left = from
    var right = size - 2
    var result = -1
    while (left <= right) {
        val mid = (left + right) ushr 1
        if (this[mid] > target) {
            left = mid + 1
            continue
        }
        result = mid
        right = mid - 1
    }
    return result
}