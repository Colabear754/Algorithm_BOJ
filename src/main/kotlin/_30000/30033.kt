package _30000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val plans = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val studies = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var count = 0
    repeat(n) { if (studies[it] >= plans[it]) count++ }
    println(count)
}