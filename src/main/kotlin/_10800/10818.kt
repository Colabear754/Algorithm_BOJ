package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val st = StringTokenizer(readLine())
    var max = -1000000
    var min = 1000000
    var n: Int
    while (st.hasMoreTokens()) {
        max = maxOf(st.nextToken().toInt().also { n = it }, max)
        min = minOf(n, min)
    }
    println("$min $max")
}