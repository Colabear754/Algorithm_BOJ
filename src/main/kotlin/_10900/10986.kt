package _10900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val sum = LongArray(n + 1)
    val modCount = IntArray(m + 1)
    StringTokenizer(readLine()).apply { repeat(n) { i -> sum[i + 1] = ((sum[i] + nextToken().toInt()) % m).also { modCount[it.toInt()]++ } } }
    println(modCount[0] + modCount.sumOf { it.toLong() * (it - 1) / 2 })
}