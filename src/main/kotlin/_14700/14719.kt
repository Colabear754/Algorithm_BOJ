package _14700

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (h, w) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val blocks = IntArray(w) { st.nextToken().toInt() }
    var rain = 0

    for (i in 1 until w - 1) {
        var left = 0
        var right = 0
        for (j in 0 until i) left = maxOf(left, blocks[j])
        for (j in i + 1 until w) right = maxOf(right, blocks[j])
        rain += (minOf(left, right) - blocks[i]).takeIf { it > 0 } ?: 0
    }
    println(rain)
}