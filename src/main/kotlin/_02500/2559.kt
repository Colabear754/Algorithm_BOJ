package _02500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val temperature = IntArray(n + 1)
    val st = StringTokenizer(readLine())
    var max = Int.MIN_VALUE
    for (i in 1..n) {
        temperature[i] = temperature[i - 1] + st.nextToken().toInt()
    }
    for (i in k..n) {
        max = maxOf(max, temperature[i] - temperature[i - k])
    }
    println(max)
}