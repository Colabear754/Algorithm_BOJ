package _14900

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var fleas = 0L
    var cost = 0L
    for (flea in arr) {
        fleas += flea
        cost += abs(fleas)
    }
    println(cost)
}