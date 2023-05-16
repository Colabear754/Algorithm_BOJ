package _18400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val arr = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val tree = IntArray(n * 4).also { it.init(arr, 1, n, 1) }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).run {
            val command = nextToken()
            val b = nextToken().toInt()
            val c = nextToken().toInt()
            when (command) {
                "1" -> if ((arr[b] - c) % 2 != 0) tree.modify(1, n, 1, b, c).also { arr[b] = c }
                "2" -> bw.write("${tree.even(1, n, 1, b, c)}\n")
                "3" -> bw.write("${tree.odd(1, n, 1, b, c)}\n")
            }
        }
    }
    bw.close()
}

private fun IntArray.init(array: IntArray, start: Int, end: Int, node: Int): Int {
    if (start == end) return (if (array[start] % 2 == 0) 0 else 1).also { this[node] = it }
    val mid = (start + end) / 2
    return (init(array, start, mid, node * 2) + init(array, mid + 1, end, node * 2 + 1)).also { this[node] = it }
}

private fun IntArray.odd(start: Int, end: Int, node: Int, left: Int, right: Int): Int {
    if (left > end || right < start) return 0
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    return odd(start, mid, node * 2, left, right) + odd(mid + 1, end, node * 2 + 1, left, right)
}

private fun IntArray.even(start: Int, end: Int, node: Int, left: Int, right: Int) = (right - left + 1) - odd(start, end, node, left, right)

private fun IntArray.modify(start: Int, end: Int, node: Int, index: Int, value: Int) {
    if (index < start || index > end) return
    this[node] += if (value % 2 == 0) -1 else 1
    if (start == end) return
    val mid = (start + end) / 2
    modify(start, mid, node * 2, index, value)
    modify(mid + 1, end, node * 2 + 1, index, value)
}