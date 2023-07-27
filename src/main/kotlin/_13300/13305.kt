package _13300

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt() - 1
    val distance = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    val price = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    var minPrice = price[0]
    var total = 0L
    for (i in 0 until n) {
        minPrice = minOf(minPrice, price[i])
        total += minPrice * distance[i]
    }
    println(total)
}