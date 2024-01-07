package _10700

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c, d, p) = IntArray(5) { readLine().toInt() }
    val xPrice = a * p
    val yPrice = if (p > c) b + (p - c) * d else b
    println(minOf(xPrice, yPrice))
}