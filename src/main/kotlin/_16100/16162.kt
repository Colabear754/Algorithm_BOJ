package _16100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, a, d) = readLine().split(' ').map { it.toInt() }
    var x = 0
    StringTokenizer(readLine()).apply {
        repeat(n) { if (nextToken().toInt() == a + d * x) x++ }
    }
    println(x)
}