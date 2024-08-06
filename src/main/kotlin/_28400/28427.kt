package _28400

import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    val query = Array(readLine().toInt()) {
        StringTokenizer(readLine()).run { nextToken().toInt().also { min = minOf(min, it) } to nextToken().toInt().also { max = maxOf(max, it) } }
    }
    val isPrime = BooleanArray(2 * max) { true }
    isPrime[0] = false
    isPrime[1] = false
    val sqrt = sqrt((2 * max - 1).toDouble()).toInt()
    for (i in 2..sqrt) {
        if (isPrime[i]) {
            for (j in i * i..<2 * max step i) isPrime[j] = false
        }
    }
    val sum = LongArray(max + 1)
    for (i in min + 1..max) {
        sum[i] = sum[i - 1] + if (isPrime[2 * i - 1]) 1 else 0
    }
    for ((a, b) in query) {
        bw.write("${sum[b] - sum[a]}")
        bw.newLine()
    }
    bw.close()
}