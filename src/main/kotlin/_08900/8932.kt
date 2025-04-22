package _08900

import java.util.StringTokenizer
import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val points = StringTokenizer(readLine()).run { DoubleArray(7) { nextToken().toDouble() } }
        bw.write("${(9.23076 * (26.7 - points[0]).pow(1.835)).toInt() +
                (1.84523 * (points[1] - 75.0).pow(1.348)).toInt() +
                (56.0211 * (points[2] - 1.5).pow(1.05)).toInt() +
                (4.99087 * (42.5 - points[3]).pow(1.81)).toInt() +
                (0.188807 * (points[4] - 210.0).pow(1.41)).toInt() +
                (15.9803 * (points[5] - 3.8).pow(1.04)).toInt() +
                (0.11193 * (254.0 - points[6]).pow(1.88)).toInt()}")
        bw.newLine()
    }
    bw.close()
}