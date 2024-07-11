package _11600

import kotlin.math.sqrt

private val Long.mod get() = this % 1000000007

fun main() = with(System.`in`.bufferedReader()) {
    var (n, m) = readLine().split(' ').map { it.toLong() }
    var result = 1L
    var denominator = 1L
    for (i in 2..sqrt(n.toDouble()).toLong()) {
        if (n % i != 0L) continue
        var count = 0
        while (n % i == 0L) {
            count++
            n /= i
        }
        result = (result * (i.power(m * count + 1)- 1)).mod
        denominator = (denominator * (i - 1)).mod
    }
    if (n > 1) {
        result = (result * (n.power(m + 1) - 1)).mod
        denominator = (denominator * (n - 1)).mod
    }
    println((result * denominator.power(1000000005)).mod)
}

private fun Long.power(n: Long): Long {
    var result = 1L
    var base = this
    var exponent = n
    while (exponent > 0) {
        if (exponent and 1 == 1L) result = (result * base).mod
        base = (base * base).mod
        exponent /= 2
    }
    return result
}