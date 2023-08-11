package _01600

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    val primeSum = getPrimeSum(n.toInt())
    var count = 0
    var left = 0
    var right = 0

    while (right < primeSum.size) {
        val sum = primeSum[right] - primeSum[left]
        if (sum == n) {
            count++
            left++
            right++
            continue
        }
        if (sum < n) right++
        else left++
    }

    println(count)
}

private fun getPrimeSum(n: Int): List<Long> {
    val isPrime = BooleanArray(n + 1) { true }
    val sqrt = sqrt(n.toDouble()).toInt()
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..sqrt) {
        if (isPrime[i]) {
            for (j in i * i..isPrime.lastIndex step i) isPrime[j] = false
        }
    }

    val resultList = mutableListOf(0L)
    for (i in isPrime.indices) {
        if (isPrime[i]) resultList.add(resultList.last() + i)
    }

    return resultList
}