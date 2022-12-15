package _25800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val freeze = readLine().toDouble().let { if (it / 0.99 > 2) 2 else (it / 0.99).toInt() }
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val solved = IntArray(n + 1)
    var max = 0
    for (i in 1..n) {
        solved[i] = st.nextToken().toInt().let {
            max = maxOf(max, it)
            if (it == 0) solved[i - 1] + 1
            else solved[i - 1]
        }
    }

    var start = 1
    var end = 1
    var maxStreak = 0
    while (end <= n) {
        val neededFreeze = solved[end] - solved[start - 1]
        if (neededFreeze <= freeze) {
            maxStreak = maxOf(maxStreak, end - start + 1)
            end++
        } else {
            start++
            if (start > end) end++
        }
    }
    println("$maxStreak\n$max")
}