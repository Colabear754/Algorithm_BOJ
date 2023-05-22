package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = IntArray(1) + IntArray(n) { readLine().toInt() }
    val tree = IntArray(n * 4).apply { init(arr, 1, n, 1) }
    repeat(m) {
        val (i, j) = StringTokenizer(readLine()).run { intArrayOf(nextToken().toInt(), nextToken().toInt()) }
        bw.write("${tree.min(1, n, 1, i, j)}\n")
    }
    bw.close()
}

private fun IntArray.init(array: IntArray, start: Int, end: Int, node: Int): Int {
    if (start == end) return array[start].also { this[node] = it }
    val mid = (start + end) / 2
    return (minOf(init(array, start, mid, node * 2), init(array, mid + 1, end, node * 2 + 1))).also { this[node] = it }
}

private fun IntArray.min(start: Int, end: Int, node: Int, left: Int, right: Int): Int {
    if (left > end || right < start) return Int.MAX_VALUE
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    return minOf(min(start, mid, node * 2, left, right), min(mid + 1, end, node * 2 + 1, left, right))
}