package _32700

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    if (n == 2 && k == 1) return@with println("1 2")
    if (n > 1) return@with println(-1)
    println("1 ".repeat(n * k))
}