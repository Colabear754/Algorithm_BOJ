package _27900

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    if (n == 1) return@with println(0)
    val heights = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val differences = IntArray(n)
    differences[0] = abs(heights[0] - heights[1])
    differences[n - 1] = abs(heights[n - 2] - heights[n - 1])
    for (i in 1..<n - 1) {
        differences[i] = maxOf(abs(heights[i - 1] - heights[i]), abs(heights[i + 1] - heights[i]))
    }
    differences.sort()
    var left = 0
    var right = differences.last()
    var result = right
    while (left <= right) {
        val mid = (left + right) / 2
        val count = n - differences.upperBound(mid)
        if (count <= k) {
            result = mid
            right = mid - 1
            continue
        }
        left = mid + 1
    }
    println(result)
}

private fun IntArray.upperBound(n: Int): Int {
    var left = 0
    var right = size
    while (left < right) {
        val mid = (left + right) / 2
        if (this[mid] <= n) left = mid + 1 else right = mid
    }
    return left
}