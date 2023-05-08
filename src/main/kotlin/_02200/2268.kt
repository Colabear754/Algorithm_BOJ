package _02200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = LongArray(n + 1)
    val tree = LongArray(n * 4)
    repeat(m) {
        StringTokenizer(readLine()).apply {
            val command = nextToken()
            var i = nextToken().toInt()
            var j = nextToken().toInt()
            when (command) {
                "0" -> {
                    if (i > j) i = j.also { j = i }
                    bw.write("${tree.sum(1, n, 1, i, j)}\n")
                }
                "1" -> {
                    tree.modify(1, n, 1, i, j - arr[i])
                    arr[i] = j.toLong()
                }
            }
        }
    }
    bw.close()
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