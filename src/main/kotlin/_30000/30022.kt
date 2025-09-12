package _30000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, a, _) = readLine().split(' ').map { it.toInt() }
    val productPrices = Array(n) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
        .apply { sortBy { it[0] - it[1] } }
    var sum = 0L
    for (i in 0..<a) sum += productPrices[i][0]
    for (i in a..<n) sum += productPrices[i][1]
    println(sum)
}