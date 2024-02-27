package _15500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val lionPosition = ArrayList<Int>()
    StringTokenizer(readLine()).apply { repeat(n) { if (nextToken() == "1") lionPosition.add(it) } }
    if (lionPosition.size < k) {
        println(-1)
        return@with
    }
    var min = Int.MAX_VALUE
    var left = 0
    var right = k - 1
    while (right < lionPosition.size) {
        min = minOf(min, lionPosition[right] - lionPosition[left] + 1)
        left++
        right++
    }
    println(min)
}