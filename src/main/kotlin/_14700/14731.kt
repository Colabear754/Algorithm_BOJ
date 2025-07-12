package _14700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0L
    repeat(n) {
        val (c, k) = StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } }
        var power = 1L
        var base = 2L
        var exp = k - 1
        while (exp > 0L) {
            if (exp and 1L == 1L) {
                power = (power * base) % 1000000007L
            }
            base = (base * base) % 1000000007L
            exp = exp shr 1
        }
        sum += (c * k % 1000000007L) * power
        sum %= 1000000007L
    }
    println(sum % 1000000007L)
}