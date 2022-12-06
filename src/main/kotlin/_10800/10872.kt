package _10800

fun main() = print(fac(readln().toInt()))
fun fac(n: Int): Int = if (n <= 1) 1 else fac(n - 1) * n