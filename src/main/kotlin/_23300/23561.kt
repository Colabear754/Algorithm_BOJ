package _23300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val participants = StringTokenizer(readLine()).run { IntArray(n * 3) { nextToken().toInt() } }.sortedArray()
    println(participants[2 * n - 1] - participants[n])
}