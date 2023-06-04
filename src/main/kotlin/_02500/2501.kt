package _02500

import java.util.TreeSet
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val divisors = TreeSet<Int>()
    val sqrt = sqrt(n.toDouble()).toInt()
    for (i in 1..sqrt) {
        if (n % i == 0) {
            divisors.add(i)
            divisors.add(n / i)
        }
    }
    if (k > divisors.size) {
        println(0)
        return@with
    }
    repeat(k - 1) { divisors.pollFirst() }
    println(divisors.first())
}