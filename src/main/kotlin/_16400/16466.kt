package _16400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val tickets = BooleanArray(n + 2)
    StringTokenizer(readLine()).run { repeat(n) { nextToken().toInt().let { if (it in 1..n + 1) tickets[it] = true } } }
    for (i in 1..(n + 1)) {
        if (!tickets[i]) {
            return@with println(i)
        }
    }
}