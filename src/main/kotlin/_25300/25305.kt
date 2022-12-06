package _25300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val scores = IntArray(n) { st.nextToken().toInt() }.sortedDescending()
    println(scores[k - 1])
}