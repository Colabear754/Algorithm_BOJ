package _31900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val infected = BooleanArray(n + 1)
    StringTokenizer(readLine()).apply { repeat(k) { infected[nextToken().toInt()] = true } }
    val logs = MutableList(m) { StringTokenizer(readLine()).run { Log(nextToken().toInt(), nextToken().toInt(), nextToken().toInt()) } }
        .apply { sort() }
    for (i in 1..n) {
        if (!infected[i]) continue
        val currentCase = BooleanArray(n + 1).apply { this[i] = true }
        for (log in logs) {
            if (currentCase[log.from]) currentCase[log.to] = true
        }
        if (currentCase contentEquals infected) return@with println(i)
    }
}

private class Log(val time: Int, val from: Int, val to: Int) : Comparable<Log> {
    override fun compareTo(other: Log): Int = this.time - other.time
}