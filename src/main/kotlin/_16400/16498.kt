package _16400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(' ').map { it.toInt() }
    val cards = Array(3) { StringTokenizer(readLine()).run { IntArray(input[it]) { nextToken().toInt() } } }
    cards[1].sort()
    cards[2].sort()
    println(cards[0].minOf {
        val b = cards[1].binaraySearch(it)
        val c1 = cards[2].binaraySearch(it)
        val c2 = cards[2].binaraySearch(b)
        minOf(maxOf(it, b, c1) - minOf(it, b, c1), maxOf(it, b, c2) - minOf(it, b, c2))
    })
}

private fun IntArray.binaraySearch(target: Int): Int {
    val index = binarySearch(target)
    if (index >= 0) return this[index]
    val left = if (index == -1) first() else this[-index - 2]
    val right = if (-index > size) last() else this[-index - 1]
    return if (right - target < target - left) right else left
}