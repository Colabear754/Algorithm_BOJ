package _29700

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val blackholes = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.apply { sort() }
    var p = 0
    repeat(m) {
        val (a, w) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        var left = 0
        var right = n - 1
        var min = Int.MAX_VALUE
        while (left <= right) {
            val mid = (left + right) / 2
            min = minOf(min, w * abs(blackholes[mid] - a))
            if (blackholes[mid] < a) left = mid + 1
            else right = mid - 1
        }
        p = maxOf(p, min)
    }
    println(p)
}