package _11600

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
    val mod = 1L shl 32
    var result = 1L
    for (i in 2..n) {
        if (isPrime[i]) {
            var maxPow = 1L
            while (maxPow * i <= n) maxPow *= i
            result = (result * maxPow) % mod
        }
    }
    println(result)
}