package _15900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (x1, y1, x2, y2) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
    val (x3, y3, x4, y4) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
    println(
        when {
            (x1 == x4 && (y1 == y4 || y2 == y3)) || (x2 == x3 && (y1 == y4 || y2 == y3)) -> "POINT"
            (x1 < x4 && x2 > x3 && (y2 == y3 || y1 == y4)) || (y1 < y4 && y2 > y3 && (x2 == x3 || x1 == x4)) -> "LINE"
            x2 > x3 && y2 > y3 && x1 < x4 && y1 < y4 -> "FACE"
            else -> "NULL"
        }
    )
}