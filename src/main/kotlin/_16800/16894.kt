package _16800

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toLong()
    val limit = sqrt(n.toDouble()).toLong()
    var count = 0
    for (i in 2..limit) {
        while (n % i == 0L) {
            n /= i
            count++
            if (count > 2) break
        }
        if (count > 2) break
    }
    if (n > 1) count++
    println(if (count == 2) "cubelover" else "koosaga")
}