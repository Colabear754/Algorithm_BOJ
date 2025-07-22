package _02600

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (open1, open2) = readLine().split(' ').map { it.toInt() }
    val m = readLine().toInt()
    val cabinetNumbers = IntArray(m) { readLine().toInt() }
    val dp = Array(n + 1) { Array(n + 1) { IntArray(m + 1) { -1 } } }
    fun solve(a: Int, b: Int, c: Int): Int {
        if (c == m) return 0
        if (dp[a][b][c] != -1) return dp[a][b][c]
        val next = cabinetNumbers[c]
        val result = minOf(
            solve(next, b, c + 1) + abs(a - next),
            solve(a, next, c + 1) + abs(b - next)
        )
        return result.also { dp[a][b][c] = it }
    }
    println(solve(open1, open2, 0))
}