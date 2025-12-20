package _06400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (p1, p2, p3, p4) = StringTokenizer(readLine()).run { Array(4) { nextToken().toLong() to nextToken().toLong() } }
        val a1 = p1.second - p2.second
        val b1 = p2.first - p1.first
        val c1 = -a1 * p1.first - b1 * p1.second
        val a2 = p3.second - p4.second
        val b2 = p4.first - p3.first
        val c2 = -a2 * p3.first - b2 * p3.second
        val determinant = a1 * b2 - a2 * b1
        if (determinant == 0L) {
            bw.appendLine(if (a1 * p3.first + b1 * p3.second + c1 == 0L) "LINE" else "NONE")
            return@repeat
        }
        val x = (b1 * c2 - b2 * c1).toDouble() / determinant
        val y = (c1 * a2 - c2 * a1).toDouble() / determinant
        bw.appendLine("POINT %.2f %.2f".format(x, y))
    }
    bw.close()
}