package _16500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val sumOfTime = IntArray(n + 1)
    StringTokenizer(readLine()).apply {
        for (i in 1..n) sumOfTime[i] = sumOfTime[i - 1] + nextToken().toInt()
    }
    repeat(m) {
        val jobs = sumOfTime.binarySearch(readLine().toInt())
        bw.appendLine(if (jobs < 0) "${-jobs - 2}" else "$jobs")
    }
    bw.close()
}