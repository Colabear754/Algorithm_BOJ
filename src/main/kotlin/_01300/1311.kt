package _01300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val d = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val size = 1 shl n
    val cost = IntArray(size) { -1 }
    val finish = size - 1
    fun dp(current: Int, visited: Int): Int {
        if (current == n) return if (visited == finish) 0 else Int.MAX_VALUE
        if (cost[visited] != -1) return cost[visited]
        var result = Int.MAX_VALUE
        for (i in 0 until n) {
            if (visited and (1 shl i) == 0)
                result = minOf(result, dp(current + 1, visited or (1 shl i)) + d[current][i]).also { cost[visited] = it }
        }
        return result
    }
    println(dp(0, 0))
}