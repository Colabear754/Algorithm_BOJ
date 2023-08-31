package _12700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val cards = arrayOf(IntArray(m)) + Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() }.sortedArrayDescending() } }
    val score = IntArray(n + 1)
    repeat(m) { i ->
        val max = cards.maxOf { it[i] }
        for (j in 1..n) {
            if (cards[j][i] == max) score[j]++
        }
    }
    val maxScore = score.max()
    println((1..n).filter { score[it] == maxScore }.joinToString(" "))
}