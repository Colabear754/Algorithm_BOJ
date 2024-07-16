package _27400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val papers = BooleanArray(n + 1)
    StringTokenizer(readLine()).apply { repeat(m) { papers[nextToken().toInt()] = true } }
    var ink = 0
    var prev = 0
    for (i in 1..n) {
        if (papers[i]) continue
        ink += if (prev == 0) 7 else minOf(7, (i - prev) * 2)
        prev = i
    }
    println(ink)
}