package _25600

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toInt() }
    val (c, d) = readLine().split(' ').map { it.toInt() }
    val max = maxOf(b, d)
    val isPrime = BooleanArray(max + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    val sqrt = sqrt(max.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (isPrime[i]) {
            for (j in i * i..max step i) isPrime[j] = false
        }
    }
    val overlappingCount = (maxOf(a, c)..minOf(b, d)).count { isPrime[it] }
    val ytCount = (a..b).count { isPrime[it] } - overlappingCount
    val yjCount = (c..d).count { isPrime[it] } - overlappingCount
    println(
        when {
            ytCount > yjCount -> "yt"
            ytCount < yjCount -> "yj"
            else -> if (overlappingCount and 1 == 0) "yj" else "yt"
        }
    )
}