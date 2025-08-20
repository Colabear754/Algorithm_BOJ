package _32000

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (left, right, start) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        val leftDistance = abs(left - start)
        val rightDistance = abs(right - start)
        bw.write(if (leftDistance < rightDistance) "${leftDistance * 2 + 1}" else "${rightDistance * 2}")
        bw.newLine()
    }
    bw.close()
}