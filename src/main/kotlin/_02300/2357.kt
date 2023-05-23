package _02300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = IntArray(1) + IntArray(n) { readLine().toInt() }
    val tree = Array(n * 4) { IntArray(2) }.apply { init(arr, 1, n, 1) }
    repeat(m) {
        StringTokenizer(readLine()).run { intArrayOf(nextToken().toInt(), nextToken().toInt()) }
            .let { ints ->  tree.minMax(1, n, 1, ints[0], ints[1]) }
            .also { bw.write("${it[0]} ${it[1]}\n") }
    }
    bw.close()
}

private fun Array<IntArray>.init(array: IntArray, start: Int, end: Int, node: Int): IntArray {
    if (start == end) return intArrayOf(array[start], array[start]).also { this[node] = it }
    val mid = (start + end) / 2
    val next1 = init(array, start, mid, node * 2)
    val next2 = init(array, mid + 1, end, node * 2 + 1)
    return intArrayOf(
        minOf(next1[0], next2[0]),
        maxOf(next1[1], next2[1])
    ).also { this[node] = it }
}


private fun Array<IntArray>.minMax(start: Int, end: Int, node: Int, left: Int, right: Int): IntArray {
    if (left > end || right < start) return intArrayOf(Int.MAX_VALUE, 0)
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    val next1 = minMax(start, mid, node * 2, left, right)
    val next2 = minMax(mid + 1, end, node * 2 + 1, left, right)
    return intArrayOf(
        minOf(next1[0], next2[0]),
        maxOf(next1[1], next2[1])
    )
}
