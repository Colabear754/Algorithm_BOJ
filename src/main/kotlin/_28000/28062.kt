package _28000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var countOdd = 0
    var minOdd = Int.MAX_VALUE
    val candies = StringTokenizer(readLine()).run {
        IntArray(n) {
            nextToken().toInt().apply {
                if (this and 1 == 1) {
                    countOdd++
                    minOdd = minOf(minOdd, this)
                }
            }
        }
    }
    println(
        when {
            countOdd == 1 && n == 1 -> 0
            countOdd and 1 == 1 -> candies.sum() - minOdd
            else -> candies.sum()
        }
    )
}