package _01200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val d = intArrayOf(0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 2)
    val dp = IntArray(n + 1)
    if (n < 13) {
        println(d[n])
        return@with
    }

    for (i in d.indices) {
        dp[i] = d[i]
    }

    val hexagonalNumbers = ArrayList<Int>().apply {
        var current = 1
        while ((lastOrNull() ?: 0) <= n) {
            add(current * (2 * current - 1))
            current++
        }
    }

    hexagonalNumbers.removeAt(hexagonalNumbers.lastIndex)
    for (i in 13..n) {
        var min = Int.MAX_VALUE
        for (hex in hexagonalNumbers) {
            if (hex > i) break
            min = minOf(min, dp[i - hex])
        }
        dp[i] = min + 1
    }
    println(dp[n])
}