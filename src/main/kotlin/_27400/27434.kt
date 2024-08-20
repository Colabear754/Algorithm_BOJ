package _27400

import java.math.BigInteger

fun main() = println(1.factorial(readln().toInt()))

private fun Int.factorial(n: Int): BigInteger = if (this < n) factorial((this + n) / 2) * ((this + n) / 2 + 1).factorial(n) else toBigInteger()