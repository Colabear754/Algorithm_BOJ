package _14700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val circles = arrayOf("PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY")
    val n = readLine().toInt()
    println(circles[IntArray(9) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.max() } }
        .run { indexOf(max()) }])
}