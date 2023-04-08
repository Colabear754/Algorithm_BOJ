package _01600

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    val sqrt = sqrt(n.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (isPrime[i]) {
            for (j in i * i..n step i)
                isPrime[j] = false
        }
    }
    val primes = isPrime.withIndex().filter { it.value }.map { it.index }
    var result = 1L
    for (p in primes) {
        var max = 0
        var index = 1
        if (p <= sqrt) {
            while (true) {
                val temp = p.pow(index++)
                if (temp <= n) max = temp
                else break
            }
        } else max = p
        result = (result * max) % 987654321
    }
    println(result)
}

private fun Int.pow(n: Int) = run {
    var result = 1
    repeat(n) { result *= this }
    result
}