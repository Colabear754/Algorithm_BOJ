package _07800

import kotlin.math.E
import kotlin.math.PI
import kotlin.math.floor
import kotlin.math.log10

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val m = readLine().toDouble()
        bw.appendLine(if (m < 2) "1" else "${floor(m * log10(m / E) + 0.5 * log10(2 * PI * m)).toInt() + 1}")
    }
    bw.close()
}