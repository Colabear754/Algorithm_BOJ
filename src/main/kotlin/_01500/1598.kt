package _01500

import kotlin.math.abs

private fun position(n: Int): Array<Int> = if (n % 4 == 0) arrayOf(n / 4 - 1, 3) else arrayOf(n / 4, n % 4 - 1) // 숫자의 좌표
fun main() = print(readln().split(" ").map { it.toInt() }.let { abs(position(it[0])[0] - position(it[1])[0]) + abs(position(it[0])[1] - position(it[1])[1]) })