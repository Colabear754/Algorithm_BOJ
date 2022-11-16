package _01900

fun main() = print(readln().split(" ").map { it.toInt() }.let { val (m, n) = it;if (m > n) 2 * n - 1 else 2 * m - 2 })