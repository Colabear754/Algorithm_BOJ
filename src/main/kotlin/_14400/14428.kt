package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val arr = intArrayOf(Int.MAX_VALUE) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val tree = IntArray(n * 4).apply { init(arr, 1, n, 1) }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val (q, i, j) = IntArray(3) { nextToken().toInt() }
            when (q) {
                1 -> {
                    arr[i] = j
                    tree.modify(arr, 1, n, 1, i)
                }
                2 -> {
                    bw.write("${tree.minIndexOf(arr, 1, n, 1, i, j)}")
                    bw.newLine()
                }
            }
        }
    }
    bw.close()
}

private fun IntArray.init(array: IntArray, start: Int, end: Int, node: Int): Int {
    if (start == end) return start.also { this[node] = it }
    val mid = (start + end) / 2
    return array.indexOf(
        init(array, start, mid, node * 2),
        init(array, mid + 1, end, node * 2 + 1)
    ).also { this[node] = it }
}

private fun IntArray.modify(array: IntArray, start: Int, end: Int, node: Int, index: Int): Int {
    if (index < start || index > end) return this[node]
    if (start == end) return index.also { this[node] = it }
    val mid = (start + end) / 2
    return array.indexOf(
        modify(array, start, mid, node * 2, index),
        modify(array, mid + 1, end, node * 2 + 1, index)
    ).also { this[node] = it }
}

private fun IntArray.minIndexOf(array: IntArray, start: Int, end: Int, node: Int, left: Int, right: Int): Int {
    if (right < start || left > end) return 0
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    return array.indexOf(
        minIndexOf(array, start, mid, node * 2, left, right),
        minIndexOf(array, mid + 1, end, node * 2 + 1, left, right)
    )
}

private fun IntArray.indexOf(left: Int, right: Int) =
    if (this[left] > this[right]) right
    else if (this[left] < this[right]) left
    else minOf(left, right)