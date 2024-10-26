package _16900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (h, w, x, y) = readLine().split(' ').map { it.toInt() }
    val array = Array(h + x) { StringTokenizer(readLine()).run { IntArray(w + y) { nextToken().toInt() } } }
    val result = Array(h) { IntArray(w) }
    for (i in 0..<h) {
        for (j in 0..<w) {
            result[i][j] = if (i < x || j < y) array[i][j] else array[i][j] - result[i - x][j - y]
        }
    }
    println(result.joinToString("\n") { it.joinToString(" ") })
}