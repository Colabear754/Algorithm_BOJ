package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val basket = IntArray(n + 1) { it }
    repeat(m) {
        StringTokenizer(readLine()).apply {
            val i = nextToken().toInt()
            val j = nextToken().toInt()
            basket[i] = basket[j].also { basket[j] = basket[i] }
        }
    }
    println(basket.drop(1).joinToString(" "))
}