package _02700

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val last = ((sqrt(8.0 * n + 1) - 1) / 2).toInt()
        var count = 0
        for (i in 2..last) {
            if ((n - i * (i - 1) / 2) % i == 0) count++
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}