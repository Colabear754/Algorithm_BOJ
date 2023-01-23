package _11400

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    println(fibonacci(readLine().toBigInteger()))
}

private val B0 = 0.toBigInteger()
private val B1 = 1.toBigInteger()
private val B2 = 2.toBigInteger()
private val fibonacciMemory = HashMap<BigInteger, Long>().apply {
    put(B0, 0L)
    put(B1, 1L)
}

private fun fibonacci(n: BigInteger): Long {
    if (fibonacciMemory[n] == null) {
        val f_n = fibonacci(n / B2)
        when (n % B2) {
            B0 -> fibonacciMemory[n] = (f_n * (2 * fibonacci(n / B2 - B1) + f_n)) % 1000000007
            B1 -> fibonacciMemory[n] = (f_n * f_n + fibonacci(n / B2 + B1) * fibonacci(n / B2 + B1)) % 1000000007
        }
    }

    return fibonacciMemory[n] ?: 0L
}