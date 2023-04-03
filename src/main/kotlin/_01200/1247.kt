package _01200

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(3) {
        Array(readLine().toInt()) { readLine().toBigInteger() }.sumOf { it }.also {
            val sign = it.compareTo(BigInteger.ZERO)
            bw.write(if (sign > 0) "+\n" else if (sign < 0) "-\n" else "0\n")
        }
    }
    bw.close()
}