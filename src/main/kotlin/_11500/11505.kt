package _11500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val arr = IntArray(1) + IntArray(n) { readLine().toInt() }
    val tree = LongArray(4 * n).apply { init(arr, 1, n, 1) }
    repeat(m + k) {
        StringTokenizer(readLine()).run {
            val (a, b, c) = intArrayOf(nextToken().toInt(), nextToken().toInt(), nextToken().toInt())
            when (a) {
                1 -> tree.modify(1, n, 1, b, c).also { arr[b] = c }
                2 -> bw.write("${tree.multi(1, n, 1, b, c)}\n")
            }
        }
    }
    bw.close()
}

private fun LongArray.init(array: IntArray, start: Int, end: Int, node: Int): Long {
    if (start == end) return array[start].toLong().also { this[node] = it }
    val mid = (start + end) / 2
    return ((init(array, start, mid, node * 2) * init(array, mid + 1, end, node * 2 + 1)) % 1000000007).also { this[node] = it }
}

private fun LongArray.multi(start: Int, end: Int, node: Int, left: Int, right: Int): Long {
    if (left > end || right < start) return 1
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    return (multi(start, mid, node * 2, left, right) * multi(mid + 1, end, node * 2 + 1, left, right)) % 1000000007
}

private fun LongArray.modify(start: Int, end: Int, node: Int, index: Int, value: Int): Long {
    if (index < start || index > end) return this[node]
    if (start == end) return value.toLong().also { this[node] = it }
    val mid = (start + end) / 2
    return ((modify(start, mid, node * 2, index, value) * modify(mid + 1, end, node * 2 + 1, index, value)) % 1000000007).also { this[node] = it }
}