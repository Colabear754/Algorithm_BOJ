package _02300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val xMap = HashMap<String, Int>()
    val yMap = HashMap<String, Int>()
    var count = 0
    repeat(readLine().toInt()) {
        val (x, y) = StringTokenizer(readLine()).run { Array(2) { nextToken() } }
        xMap[x] = (xMap[x]?.also { if (it == 1) count++ } ?: 0) + 1
        yMap[y] = (yMap[y]?.also { if (it == 1) count++ } ?: 0) + 1
    }
    println(count)
}