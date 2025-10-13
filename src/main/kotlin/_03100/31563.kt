package _03100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val sum = LongArray(n + 1)
    StringTokenizer(readLine()).apply { for (i in 1..n) sum[i] = sum[i - 1] + nextToken().toLong() }
    var shift = 0
    repeat(q) { StringTokenizer(readLine()).apply {
        when (nextToken()) {
            "1" -> shift = (shift - nextToken().toInt() + n) % n
            "2" -> shift = (shift + nextToken().toInt()) % n
            "3" -> {
                val (a, b) = IntArray(2) { (nextToken().toInt() + shift - 1) % n }
                bw.appendLine(if (a <= b) "${sum[b + 1] - sum[a]}" else "${sum[n] - sum[a] + sum[b + 1]}")
            }
        }
    } }
    bw.close()
}