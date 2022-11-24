package _01000

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val times = readLine().toInt()
    repeat(times) {
        bw.write("${readLine().split(" ").map { it.toInt() }.let { comb(it[1], it[0]) }}\n")
    }
    bw.close()
}

fun comb(n: Int, k: Int): BigInteger {
    val a = minOf(k, n - k)
    val b = maxOf(k, n - k)
    var result = 1.toBigInteger()
    var minFac = 1L
    for (i in n downTo b + 1) {
        result = result.multiply(i.toBigInteger())
    }
    for (i in 2..a) {
        minFac *= i
    }
    return result.divide(minFac.toBigInteger())
}