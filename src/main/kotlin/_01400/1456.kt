package _01400

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toLong() }
    val primeNumbers = getPrimes(b)
    var count = 0

    for (prime in primeNumbers) {
        var num = prime
        while (num <= b) {
            if (prime > 46415 && num > 10_000_000) break
            num *= prime
            if (num in a..b) count++
        }
    }

    println(count)
}

private fun getPrimes(b: Long): List<Long> {
    val isPrime = BooleanArray(sqrt(b.toDouble()).toInt() + 1) { true }
    val sqrt = sqrt(isPrime.lastIndex.toDouble()).toInt()
    val resultList = mutableListOf<Long>()
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..sqrt) {
        if (isPrime[i]) {
            for (j in i * i..isPrime.lastIndex step i) isPrime[j] = false
        }
    }

    for (i in isPrime.indices) {
        if (isPrime[i]) resultList.add(i.toLong())
    }
    return resultList
}
