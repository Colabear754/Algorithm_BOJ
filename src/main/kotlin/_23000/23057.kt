package _23000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cards = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val m = cards.sum()
    val sums = mutableSetOf(0)
    for (card in cards) {
        val newSums = mutableListOf<Int>()
        sums.forEach { newSums.add(it + card) }
        sums.addAll(newSums)
    }
    println(m - sums.size + 1)
}