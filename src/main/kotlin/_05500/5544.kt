package _05500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val victoryPoints = IntArray(n + 1)
    repeat(n * (n - 1) / 2) {
        val (a, b, c, d) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
        when {
            c > d -> victoryPoints[a] += 3
            d > c -> victoryPoints[b] += 3
            else -> {
                victoryPoints[a]++
                victoryPoints[b]++
            }
        }
    }
    val ranks = IntArray(n + 1)
    for (i in 1..n) {
        var rank = 1
        for (j in 1..n) {
            if (victoryPoints[j] > victoryPoints[i]) rank++
        }
        ranks[i] = rank
    }
    println((1..n).joinToString("\n") { "${ranks[it]}" })
}