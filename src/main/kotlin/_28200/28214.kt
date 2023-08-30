package _28200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k, p) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val bread = Array(n) { IntArray(k) { st.nextToken().toInt() } }
    var count = 0
    for (pack in bread) {
        if (pack.count { it == 0 } < p) count++
    }
    println(count)
}