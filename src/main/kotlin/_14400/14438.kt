package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val arr = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val tree = IntArray(n * 4).apply { init(arr, 1, n, 1) }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).run {
            val (q, i, j) = intArrayOf(nextToken().toInt(), nextToken().toInt(), nextToken().toInt())
            when (q) {
                1 -> tree.modify(1, n, 1, i, j)
                2 -> bw.write("${tree.min(1, n, 1, i, j)}\n")
            }
        }
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

private fun IntArray.modify(start: Int, end: Int, node: Int, index: Int, value: Int) {
    if (index < start || index > end) return
    this[node] = value
    if (start == end) return
    val mid = (start + end) / 2
    modify(start, mid, node * 2, index, value)
    modify(mid + 1, end, node * 2 + 1, index, value)
    this[node] = minOf(this[node * 2], this[node * 2 + 1])
}