package _01600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (w, n) = readLine().split(' ').map { it.toInt() }
        var currentWeight = 0
        var currentPosition = 0
        var result = 0
        repeat(n) {
            val (xi, wi) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
            result += xi - currentPosition
            currentPosition = xi
            if (currentWeight + wi < w) {
                currentWeight += wi
                return@repeat
            }
            result += xi
            if (currentWeight + wi == w) {
                currentWeight = 0
                currentPosition = 0
                return@repeat
            }
            currentWeight = wi
            result += xi
        }
        result += currentPosition
        bw.write("$result")
        bw.newLine()
    }
    bw.close()
}