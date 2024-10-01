package _02400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var max = 0
    repeat(n) {
        val dice = IntArray(7)
        StringTokenizer(readLine()).run { repeat(3) { dice[nextToken().toInt()]++ } }
        max = maxOf(max, when (val maxCount = dice.max()) {
            3 -> dice.lastIndexOf(maxCount) * 1000 + 10000
            2 -> dice.lastIndexOf(maxCount) * 100 + 1000
            else -> dice.lastIndexOf(maxCount) * 100
        })
    }
    println(max)
}