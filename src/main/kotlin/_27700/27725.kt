package _27700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val primes = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val k = readLine().toLong()
    var result = 0L
    for (prime in primes) {
        var count = 0L
        var num = k
        while (num > 0) {
            num /= prime
            count += num
        }
        result += count
    }
    println(result)
}