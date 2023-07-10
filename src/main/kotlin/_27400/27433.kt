package _27400

fun main() = print(fact(readln().toLong()))
private fun fact(n: Long): Long = if (n == 0L) 1 else n * fact(n - 1)