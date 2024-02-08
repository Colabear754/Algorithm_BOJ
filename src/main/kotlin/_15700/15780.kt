package _15700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    var sum = 0
    StringTokenizer(readLine()).apply {
        while (hasMoreTokens()) {
            sum += nextToken().toInt().let { if (it and 1 == 0) it / 2 else it / 2 + 1 }
        }
    }
    println(if (sum >= n) "YES" else "NO")
}