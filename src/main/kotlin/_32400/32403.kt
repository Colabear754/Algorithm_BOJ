package _32400

import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(' ').map { it.toInt() }
    val cycles = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val measures = mutableListOf(0, Int.MAX_VALUE)
    for (i in 1..sqrt(t.toDouble()).toInt()) {
        if (t % i == 0) {
            measures.add(i)
            measures.add(t / i)
        }
    }
    measures.sort()
    var result = 0
    for (cycle in cycles) {
        val searchedIndex = measures.binarySearch(cycle).let { if (it < 0) -it - 1 else it }
        result += minOf(abs(cycle - measures[searchedIndex]), abs(cycle - measures[searchedIndex - 1]))
    }
    println(result)
}