package _31400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val count = IntArray(100001)
    StringTokenizer(readLine()).apply { repeat(n) { count[nextToken().toInt()]++ } }
    println(if (count.max() <= (n + 1) / 2) "YES" else "NO")
}