package _01000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    repeat(n) {
        val input = StringTokenizer(readLine()).run { LongArray(6) { nextToken().toLong() } }
        bw.write("${calc(input)}\n")
    }
    bw.close()
}

private fun calc(l: LongArray): Int {
    val distance = (l[3] - l[0]).pow() + (l[4] - l[1]).pow()
    val result = when {
        distance == 0L && l[2] == l[5] && l[2] != 0L -> -1
        distance > (l[2] + l[5]).pow() || distance < (l[2] - l[5]).pow() || (distance == 0L && l[2] != l[5]) -> 0
        distance == (l[2] + l[5]).pow() || distance == (l[2] - l[5]).pow() -> 1
        else -> 2
    }
    return result
}

private fun Long.pow() = this * this