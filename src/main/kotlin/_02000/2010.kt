package _02000

fun main() = print(readln().toInt().let { var p = 1 - it;repeat(it) { p += readln().toInt() };p })