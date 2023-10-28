package _15600

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val measures = ArrayList<Int>()
    for (i in 1..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            measures.add(i)
            if (i != n / i) measures.add(n / i)
        }
    }
    println(measures.sum() * 5 - 24)
}