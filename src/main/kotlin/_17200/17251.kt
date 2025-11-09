package _17200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var max = 0
    val powers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt().also { if (it > max) max = it } } }
    val maxFirstIndex = powers.indexOfFirst { it == max } + 1
    val maxLastIndex = powers.indexOfLast { it == max } + 1
    val blue = maxFirstIndex - 1
    val draw = maxLastIndex - maxFirstIndex
    val red = n - 1 - blue - draw
    println(if (red > blue) "R" else if (blue > red) "B" else "X")
}