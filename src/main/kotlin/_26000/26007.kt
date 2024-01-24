package _26000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, k, x) = readLine().split(' ').map { it.toInt() }
    val rating = IntArray(n + 1) { x }
    val count = IntArray(n + 1)
    StringTokenizer(readLine()).apply {
        for (i in 1..n) {
            rating[i] = rating[i - 1] + nextToken().toInt()
            count[i] = count[i - 1] + if (rating[i] < k) 1 else 0
        }
    }
    repeat(m) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        bw.write("${count[b - 1] - count[a - 1]}")
        bw.newLine()
    }
    bw.close()
}