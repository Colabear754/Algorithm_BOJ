package _14200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val tree = (IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } })
        .let { Array(n * 4) { IntArray(2) }.apply { init(it, 1, n, 1) } }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val (command, a) = intArrayOf(nextToken().toInt(), nextToken().toInt())
            when (command) {
                1 -> {
                    val (b, c) = intArrayOf(nextToken().toInt(), nextToken().toInt())
                    tree.modifyValue(1, n, 1, a + 1, b + 1, c)
                }
                2 -> bw.write("${tree.find(1, n, 1, a + 1)}\n")
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

private fun Array<IntArray>.find(start: Int, end: Int, node: Int, index: Int): Int {
    modifyLazy(start, end, node)
    if (index > end || index < start) return 0
    if (index in end..start) return this[node][0]
    val mid = (start + end) / 2
    return find(start, mid, node * 2, index) xor find(mid + 1, end, node * 2 + 1, index)
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