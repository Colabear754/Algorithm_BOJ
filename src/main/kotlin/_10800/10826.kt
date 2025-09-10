package _10800

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 0) return@with println(0)
    val fibonacci = Array(n + 1) { BigInteger.ZERO }
    fibonacci[1] = BigInteger.ONE
    for (i in 2..n) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }
    println(fibonacci[n])
}