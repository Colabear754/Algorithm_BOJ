package _01800

fun main() = print(readln().toLong().let { (it - 1) * it * (it + 1) / 2 })