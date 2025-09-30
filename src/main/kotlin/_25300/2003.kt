package _25300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val sum = IntArray(n + 1)
    StringTokenizer(readLine()).apply { repeat(n) { sum[it + 1] = sum[it] + nextToken().toInt() } }
    var count = 0
    var left = 0
    var right = 1
    while (right <= n) {
        val current = sum[right] - sum[left]
        if (current == m) {
            count++
            left++
            right++
            continue
        }
        if (current < m) right++
        else left++
    }
    println(count)
}