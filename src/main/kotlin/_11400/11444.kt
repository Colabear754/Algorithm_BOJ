package _11400

import java.math.BigInteger

val fibonacciMemory = HashMap<BigInteger, Long>().apply {
    put(BigInteger.ZERO, 0L)
    put(BigInteger.ONE, 1L)
}

fun main() = with(System.`in`.bufferedReader()) {
    println(fibonacci(readLine().toBigInteger()))
}

fun fibonacci(n: BigInteger): Long {
    if (fibonacciMemory[n] == null) {
        val f_n = fibonacci(n / 2.toBigInteger())
        when (n % 2.toBigInteger()) {
            BigInteger.ZERO -> fibonacciMemory[n] = (f_n * (2 * fibonacci(n / 2.toBigInteger() - BigInteger.ONE) + f_n)) % 1000000007
            BigInteger.ONE -> fibonacciMemory[n] = (f_n * f_n + fibonacci(n / 2.toBigInteger() + BigInteger.ONE) * fibonacci(n / 2.toBigInteger() + BigInteger.ONE)) % 1000000007
        }
    }

    return fibonacciMemory[n] ?: 0L
}