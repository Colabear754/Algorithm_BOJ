package _10900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val arr = longArrayOf(0) + LongArray(n) { readLine().toLong() }
    val tree = Array(n * 4) { LongArray(2) }.also { it.init(arr, 1, n, 1) }
    repeat(m + k) {
        StringTokenizer(readLine()).run {
            val command = nextToken()
            val b = nextToken().toInt()
            val c = nextToken().toLong()
            when (command) {
                "1" -> {
                    val d = nextToken().toLong()
                    tree.modifyValue(1, n, 1, b, c.toInt(), d).also { arr[b] = d }
                }
                "2" -> bw.write("${tree.sum(1, n, 1, b, c.toInt())}\n")
            }
        }
    }
    bw.close()
}

private fun Array<LongArray>.init(array: LongArray, start: Int, end: Int, node: Int): Long {
    if (start == end) return array[start].also { this[node][0] = it }
    val mid = (start + end) / 2
    return (init(array, start, mid, node * 2) + init(array, mid + 1, end, node * 2 + 1)).also { this[node][0] = it }
}

private fun Array<LongArray>.sum(start: Int, end: Int, node: Int, left: Int, right: Int): Long {
    modifyLazy(start, end, node)
    if (left > end || right < start) return 0
    if (left <= start && end <= right) return this[node][0]
    val mid = (start + end) / 2
    return sum(start, mid, node * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right)
}

private fun Array<LongArray>.modifyLazy(start: Int, end: Int, node: Int) {
    if (this[node][1] == 0L) return
    this[node][0] += (end - start + 1) * this[node][1]
    if (start != end) {
        this[node * 2][1] += this[node][1]
        this[node * 2 + 1][1] += this[node][1]
    }
    this[node][1] = 0
}

private fun Array<LongArray>.modifyValue(start: Int, end: Int, node: Int, left: Int, right: Int, diff: Long) {
    modifyLazy(start, end, node)
    if (right < start || left > end) return
    val next = node * 2
    if (left <= start && end <= right) {
        this[node][0] += (end - start + 1) * diff
        if (start != end) {
            this[next][1] += diff
            this[next + 1][1] += diff
        }
        return
    }
    val mid = (start + end) / 2
    modifyValue(start, mid, next, left, right, diff)
    modifyValue(mid + 1, end, next + 1, left, right, diff)
    this[node][0] = this[next][0] + this[next + 1][0]
}