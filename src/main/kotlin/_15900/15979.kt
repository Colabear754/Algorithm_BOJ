package _15900

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(' ').map { it.toInt() }
    val gcd = gcd(m, n)
    println(if (gcd in -1..1) abs(gcd) else 2)
}

private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)