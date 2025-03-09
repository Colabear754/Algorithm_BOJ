package _22100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val usedBuses = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() - 1 } }
    val buses = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    var result = 0
    for (i in 0..<m - 1) {
        result += buses[usedBuses[i]][usedBuses[i + 1]]
    }
    println(result)
}