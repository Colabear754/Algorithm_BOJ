package _02400

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    println(readLine().split(' ').map { it.toInt() }.let { comb(it[0], it[1]) })
}

private fun comb(n: Int, k: Int): BigInteger {
    var a = n
    var result = BigInteger.ONE
    var kFac = BigInteger.ONE
    repeat(k) { result *= a--.toBigInteger() }
    for (i in 2..k) kFac *= i.toBigInteger()
    return result.divide(kFac)
}