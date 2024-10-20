package _16900

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    var count = 0
    for (i in 0..n) {
        for (j in 0..m) {
            for (l in 0..n) {
                for (o in 0..m) {
                    if (abs(i - l).gcd(abs(j - o)) + 1 == k) {
                        count++
                    }
                }
            }
        }
    }
    println(count / 2)
}

private fun Int.gcd(other: Int): Int = if (other == 0) this else other.gcd(rem(other))