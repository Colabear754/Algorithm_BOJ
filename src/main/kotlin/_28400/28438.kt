package _28400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, q) = readLine().split(' ').map { it.toInt() }
    val rowSum = IntArray(n + 1)
    val columnSum = IntArray(m + 1)
    repeat(q) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "1" -> rowSum[nextInt()] += nextInt()
                "2" -> columnSum[nextInt()] += nextInt()
            }
        }
    }
    for (i in 1..n) {
        for (j in 1..m) bw.write("${rowSum[i] + columnSum[j]} ")
        bw.newLine()
    }
    bw.close()
}

private fun StringTokenizer.nextInt() = nextToken().toInt()