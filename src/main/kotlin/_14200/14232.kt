package _14200

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    var k = readLine().toLong()
    val sqrt = sqrt(k.toDouble()).toLong()
    val jewels = ArrayList<Long>()
    for (i in 2..sqrt) {
        while (k % i == 0L) {
            jewels.add(i)
            k /= i
        }
    }
    if (k > 1L) jewels.add(k)
    println("${jewels.size}\n${jewels.joinToString(" ")}")
}