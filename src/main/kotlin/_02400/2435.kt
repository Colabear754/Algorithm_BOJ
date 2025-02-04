package _02400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().trim().split(' ').map { it.toInt() }
    val sum = IntArray(n + 1)
    StringTokenizer(readLine()).run {
        for (i in 1..n) {
            sum[i] = sum[i - 1] + nextToken().toInt()
        }
    }
    println((k..n).maxOf { sum[it] - sum[it - k] })
}