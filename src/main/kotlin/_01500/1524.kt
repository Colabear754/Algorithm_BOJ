package _01500

import kotlin.math.max

fun main() {
    val bw = System.out.bufferedWriter()
    val n = readln().toInt()
    repeat(n) {
        readln()
        readln()
        val S = readln().split(" ").map { it.toInt() }
        val B = readln().split(" ").map { it.toInt() }
        var SM = 0
        var BM = 0
        for (s in S) {
            SM = max(SM, s)
        }
        for (b in B) {
            BM = max(BM, b)
        }
        bw.write(
            when {
                SM >= BM -> "S\n"
                else -> "B\n"
            }
        )
    }
    bw.flush()
    bw.close()
}