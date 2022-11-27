package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val size = readLine().toInt()
    val st = StringTokenizer(readLine())
    val arr = Array(size) { st.nextToken() }
    val n = readLine()
    println(arr.count { it == n })
}