package _01000

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val times = readLine().toInt()
    repeat(times) {
        bw.write("${readLine().split(" ").map { it.toInt() }.let { it[1].comb(it[0]) }}\n")
    }
    bw.close()
}

private fun Int.comb(n: Int): BigInteger {
    var a = this
    var b = n
    var res = BigInteger.ONE
    b = minOf(b, a - b)
    var bFac = 1L
    for (i in 2..b) {
        bFac *= i.toLong()
    }
    while (b-- > 0) {
        res = res.multiply(a--.toBigInteger())
    }
    return res.divide(bFac.toBigInteger())
}