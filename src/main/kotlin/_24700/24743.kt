package _24700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var max = 0L
    var min = Long.MAX_VALUE
    repeat(n) {
        StringTokenizer(readLine(), ".").run { (1..4).fold(0L) { acc, _ -> (acc shl 8) + nextToken().toLong() } }
            .also { max = maxOf(max, it); min = minOf(min, it) }
    }
    println(((max xor min).countLeadingZeroBits() - 32).let { if (it == 0) 32 else it })
}