package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val array = longArrayOf(0) + StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    val tree = LongArray(n * 4).apply { init(array, 1, n, 1) }
    repeat(q) {
        StringTokenizer(readLine()).run {
            val query = nextToken()
            val (a, b) = IntArray(2) { nextToken().toInt() }
            when (query) {
                "1" -> {
                    bw.write("${tree.sum(1, n, 1, a, b)}")
                    bw.newLine()
                    array[a] = array[b].also { array[b] = array[a] }
                    tree.modify(1, n, 1, a, array[a] - array[b])
                    tree.modify(1, n, 1, b, array[b] - array[a])
                }
                "2" -> {
                    val (c, d) = IntArray(2) { nextToken().toInt() }
                    bw.write("${tree.sum(1, n, 1, a, b) - tree.sum(1, n, 1, c, d)}")
                    bw.newLine()
                }
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