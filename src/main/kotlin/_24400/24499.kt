package _24400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val applePie = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var max = 0
    for (i in 0..<k) max += applePie[i]
    var sum = max
    for (i in k..<n + k) {
        sum = sum - applePie[i - k] + applePie[i % n]
        max = maxOf(max, sum)
    }
    println(max)
}