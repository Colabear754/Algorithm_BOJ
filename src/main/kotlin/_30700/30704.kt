package _30700

import kotlin.math.ceil
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toDouble()
        val a = sqrt(n).toInt()
        val b = ceil(n / a).toInt()
        bw.write("${2 * (a + b)}")
        bw.newLine()
    }
    bw.close()
}