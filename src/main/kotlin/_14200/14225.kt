package _14200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val s = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.sortedArray()
    var sum = 0
    for (i in s.indices) {
        if (s[i] > sum + 1) break
        sum += s[i]
    }
    println(sum + 1)
}