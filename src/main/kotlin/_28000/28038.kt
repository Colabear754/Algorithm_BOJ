package _28000

import java.util.StringTokenizer
import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val case = readLine()
        val input = StringTokenizer(readLine()).run { DoubleArray(2) { nextToken().toDouble() } }
        when (case) {
            "1" -> input.let { (x, y) -> bw.write("${hypot(x, y)} ${atan2(y, x).let { if (it < 0) it + 2 * PI else it }}") }
            "2" -> input.let { (r, th) -> bw.write("${r * cos(th)} ${r * sin(th)}") }
        }
        bw.newLine()
    }
    bw.close()
}