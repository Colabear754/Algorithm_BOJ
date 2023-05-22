package _05600

import java.util.StringTokenizer
import kotlin.math.sign

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String?
    while (readLine().also { input = it } != null) {
        val (n, k) = input!!.split(' ').map { it.toInt() }
        val array = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
        val tree = IntArray(n * 4).apply { init(array, 1, n, 1) }
        repeat(k) {
            StringTokenizer(readLine()).run {
                val command = nextToken()
                val (i, j) = intArrayOf(nextToken().toInt(), nextToken().toInt())
                when (command) {
                    "C" -> tree.modify(1, n, 1, i, j).also { array[i] = j }
                    "P" -> bw.write("${tree.sign(1, n, 1, i, j).char}")
                }
            }
        }
        bw.write("\n")
    }
    bw.close()
}

private fun IntArray.init(array: IntArray, start: Int, end: Int, node: Int): Int {
    if (start == end) return (array[start].sign).also { this[node] = it }
    val mid = (start + end) / 2
    return (init(array, start, mid, node * 2) * init(array, mid + 1, end, node * 2 + 1)).also { this[node] = it }
}

private fun IntArray.sign(start: Int, end: Int, node: Int, left: Int, right: Int): Int {
    if (left > end || right < start) return 1
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    return sign(start, mid, node * 2, left, right) * sign(mid + 1, end, node * 2 + 1, left, right)
}

private fun IntArray.modify(start: Int, end: Int, node: Int, index: Int, value: Int) {
    if (index < start || index > end) return
    this[node] = value.sign
    if (start == end) return
    val mid = (start + end) / 2
    modify(start, mid, node * 2, index, value)
    modify(mid + 1, end, node * 2 + 1, index, value)
    this[node] = this[node * 2] * this[node * 2 + 1]
}

private val Int.char get() = if (this == 0) '0' else if (this > 0) '+' else '-'