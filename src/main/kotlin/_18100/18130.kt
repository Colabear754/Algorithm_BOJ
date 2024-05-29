package _18100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val pans = Array(n) { it + 1 to StringTokenizer(readLine()).run {
        nextToken().toLong() + nextToken().toLong().let { k -> q / k - if (q % k == 0L) 1 else 0 }.let { t -> t * (t + 1) / 2 } * nextToken().toLong()
    } }.sortedWith(compareBy({ it.second }, { it.first }))
    println("${pans[0].first} ${pans[0].second}")
}