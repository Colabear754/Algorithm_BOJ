package _12800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val balance = LongArray(n + 1)
    var result = 0L
    repeat(q) {
        StringTokenizer(readLine()).apply {
            val (query, p, x) = IntArray(3) { nextToken().toInt() }
            when (query) {
                1 -> balance[p] += x.toLong()
                2 -> {
                    for (i in p..x) result += balance[i]
                    bw.write("$result")
                    bw.newLine()
                    result = 0L
                }
            }
        }
    }
    bw.close()
}