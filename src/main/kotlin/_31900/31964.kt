package _31900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val houses = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val times = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var currentTime = houses.last()
    var currentPosition = houses.last()
    for (i in n - 1 downTo 0) {
        currentTime += currentPosition - houses[i]
        if (currentTime < times[i]) currentTime += times[i] - currentTime
        currentPosition = houses[i]
    }
    if (currentPosition != 0) currentTime += currentPosition
    println(currentTime)
}