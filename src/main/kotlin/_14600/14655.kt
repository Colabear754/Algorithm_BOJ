package _14600

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val round1 = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val round2 = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    println(round1.sumOf { abs(it) } + round2.sumOf { abs(it) })
}