package _02900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val costs = intArrayOf(0) + StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
    val parkedTrucks = IntArray(101)
    repeat(3) {
        StringTokenizer(readLine()).run { for (i in nextToken().toInt()..<nextToken().toInt()) parkedTrucks[i]++ }
    }
    println(parkedTrucks.sumOf { costs[it] * it })
}