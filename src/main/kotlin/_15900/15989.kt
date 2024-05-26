package _15900

import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var max = 0
    val input = IntArray(readInt()) { readInt().also { max = maxOf(max, it) } }
    val dp = IntArray(max + 1)
    for (i in 1..minOf(3, max)) dp[i] = i
    for (i in 4..max) dp[i] = dp[i - 3] + i / 2 + 1
    input.forEach { bw.write("${dp[it]}\n") }
    bw.close()
}

private fun BufferedReader.readInt() = readLine().toInt()