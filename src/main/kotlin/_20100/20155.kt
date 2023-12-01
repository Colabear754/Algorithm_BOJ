package _20100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val convenienceStore = IntArray(m + 1)
    StringTokenizer(readLine()).apply { repeat(n) { convenienceStore[nextToken().toInt()]++ } }
    println(convenienceStore.max())
}