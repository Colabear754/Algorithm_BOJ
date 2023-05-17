package _12800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(1) + IntArray(n) { nextToken().toInt() } }
    val tree = Array(n * 4) { IntArray(2) }.also { it.init(arr, 1, n, 1) }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val query = nextToken()
            val i = nextToken().toInt()
            val j = nextToken().toInt()
            when (query) {
                "1" -> {
                    val k = nextToken().toInt()
                    tree.modifyValue(1, n, 1, i + 1, j + 1, k)
                }
                "2" -> bw.write("${tree.xor(1, n, 1, i + 1, j + 1)}\n")
            }
        }
    }
    bw.close()
}

private fun Array<IntArray>.init(array: IntArray, start: Int, end: Int, node: Int): Int {
    if (start == end) return array[start].also { this[node][0] = it }
    val mid = (start + end) / 2
    return (init(array, start, mid, node * 2) xor init(array, mid + 1, end, node * 2 + 1)).also { this[node][0] = it }
}

private fun Array<IntArray>.xor(start: Int, end: Int, node: Int, left: Int, right: Int): Int {
    modifyLazy(start, end, node)
    if (left > end || right < start) return 0
    if (left <= start && end <= right) return this[node][0]
    val mid = (start + end) / 2
    return xor(start, mid, node * 2, left, right) xor xor(mid + 1, end, node * 2 + 1, left, right)
}

private fun Array<IntArray>.modifyLazy(start: Int, end: Int, node: Int) {
    if (this[node][1] == 0) return
    this[node][0] = this[node][0] xor (this[node][1] * ((end - start + 1) % 2))
    val next = node * 2
    if (start != end) {
        this[next][1] = this[next][1] xor this[node][1]
        this[next + 1][1] = this[next + 1][1] xor this[node][1]
    }
    this[node][1] = 0
}

private fun Array<IntArray>.modifyValue(start: Int, end: Int, node: Int, left: Int, right: Int, value: Int) {
    modifyLazy(start, end, node)
    if (right < start || left > end) return
    val next = node * 2
    if (left <= start && end <= right) {
        this[node][0] = this[node][0] xor (value * ((end - start + 1) % 2))
        if (start != end) {
            this[next][1] = this[next][1] xor value
            this[next + 1][1] = this[next + 1][1] xor value
        }
        return
    }
    val mid = (start + end) / 2
    modifyValue(start, mid, next, left, right, value)
    modifyValue(mid + 1, end, next + 1, left, right, value)
    this[node][0] = this[next][0] xor this[next + 1][0]
}