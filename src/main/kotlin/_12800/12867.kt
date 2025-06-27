package _12800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val m = readLine().toInt()
    val travelPlan = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
    val directions = readLine()
    val travelSet = mutableSetOf<Map<Int, Int>>().apply { add(emptyMap()) }
    val current = mutableMapOf<Int, Int>()
    for (i in 0..<m) {
        val dimension = travelPlan[i]
        when (directions[i]) {
            '+' -> current[dimension] = (current[dimension] ?: 0) + 1
            '-' -> current[dimension] = (current[dimension] ?: 0) - 1
        }
        if (current[dimension] == 0) {
            current.remove(dimension)
        }
        if (!travelSet.add(current.toMap())) {
            return@with println(0)
        }
    }
    println(1)
}