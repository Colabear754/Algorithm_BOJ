package _01700

fun main() = print(readln().split(" ").map { it.toInt() }.let { if (it[2] <= it[1]) -1 else it[0] / (it[2] - it[1]) + 1 })