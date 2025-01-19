package _30800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sizeChoices = StringTokenizer(readLine()).run { IntArray(6) { nextToken().toInt() } }
    val (t, p) = readLine().split(' ').map { it.toInt() }
    var tshirtSet = 0
    for (size in sizeChoices) {
        tshirtSet += (size + t - 1) / t
    }
    println("$tshirtSet\n${n / p} ${n % p}")
}