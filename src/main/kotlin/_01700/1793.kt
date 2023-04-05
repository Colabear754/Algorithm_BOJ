package _01700

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var max = 0
    val input = ArrayList<Int>().apply {
        while (readLine()?.also { add(it.toInt()) } != null) {
            max = maxOf(max, last())
        }
    }
    val dp = Array<BigInteger>(max + 3) { BigInteger.ZERO }
    dp[0] = BigInteger.ONE
    dp[1] = BigInteger.ONE
    dp[2] = BigInteger.valueOf(3)
    val two = BigInteger.valueOf(2)
    for (i in 3..max) {
        dp[i] = dp[i - 2] * two + dp[i - 1]
    }
    for (n in input) {
        bw.write("${dp[n]}\n")
    }
    bw.close()
}