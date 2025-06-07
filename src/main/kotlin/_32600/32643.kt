package _32600

import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * 2..n step i) {
                isPrime[j] = false
            }
        }
    }
    val primeCounts = IntArray(n + 1)
    for (i in 1..n) {
        primeCounts[i] = primeCounts[i - 1] + if (isPrime[i]) 1 else 0
    }
    repeat(m) {
        StringTokenizer(readLine()).run {
            val a = nextToken().toInt()
            val b = nextToken().toInt()
            bw.write("${primeCounts[b] - primeCounts[a - 1]}")
        }
        bw.newLine()
    }
    bw.close()
}