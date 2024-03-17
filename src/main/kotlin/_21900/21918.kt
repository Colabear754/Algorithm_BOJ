package _21900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val bulbs = BooleanArray(1) + StringTokenizer(readLine()).run { BooleanArray(n) { nextToken().toInt() == 1 } }
    repeat(m) {
        val (a, b, c) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        bulbs.handleLight(a, b, c)
    }
    println(StringBuilder().apply { for (i in 1..n) append(if (bulbs[i]) "1 " else "0 ") })
}

private fun BooleanArray.handleLight(a: Int, b: Int, c: Int) {
    when (a) {
        1 -> this[b] = c == 1
        2 -> for (i in b..c) this[i] = !this[i]
        3 -> for (i in b..c) this[i] = false
        4 -> for (i in b..c) this[i] = true
    }
}