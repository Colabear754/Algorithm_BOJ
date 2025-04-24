package _27500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val counts = IntArray(63)
    val n = readLine().toInt()
    StringTokenizer(readLine()).apply { repeat(n) { nextToken().toLong().takeIf { it != 0L }?.let { counts[63 - it.countLeadingZeroBits()]++ } } }
    for (i in 0..<62) {
        counts[i + 1] += counts[i] / 2
    }
    println(1L shl (62 downTo 0).first { counts[it] > 0 })
}