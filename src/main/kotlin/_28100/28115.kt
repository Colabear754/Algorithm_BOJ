package _28100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n <= 2) {
        return@with println("YES\n${readLine()}\n${"0 ".repeat(n)}")
    }
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val d = a[1] - a[0]
    for (i in 2..<n) {
        if (a[i] - a[i - 1] != d) {
            return@with println("NO")
        }
    }
    println("YES\n${a.joinToString(" ")}\n${"0 ".repeat(n)}")
}