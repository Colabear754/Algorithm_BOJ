package _02000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val arr = longArrayOf(0) + LongArray(n) { readLine().toLong() }
    val tree = LongArray(n * 4).also { it.init(arr, 1, n, 1) }
    repeat(m + k) {
        StringTokenizer(readLine()).run {
            val command = nextToken()
            val b = nextToken().toInt()
            val c = nextToken().toLong()
            when (command) {
                "1" -> tree.modify(1, n, 1, b, c - arr[b]).also { arr[b] = c }
                "2" -> bw.write("${tree.sum(1, n, 1, b, c.toInt())}\n")
            }
        }
    }
    bw.close()
}

private fun LongArray.init(array: LongArray, start: Int, end: Int, node: Int): Long {
    if (start == end) return array[start].also { this[node] = it }
    val mid = (start + end) / 2
    return (init(array, start, mid, node * 2) + init(array, mid + 1, end, node * 2 + 1)).also { this[node] = it }
}

private fun LongArray.sum(start: Int, end: Int, node: Int, left: Int, right: Int): Long {
    if (left > end || right < start) return 0
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    return sum(start, mid, node * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right)
}

private fun LongArray.modify(start: Int, end: Int, node: Int, index: Int, diff: Long) {
    if (index < start || index > end) return
    this[node] += diff
    if (start == end) return
    val mid = (start + end) / 2
    modify(start, mid, node * 2, index, diff)
    modify(mid + 1, end, node * 2 + 1, index, diff)
}