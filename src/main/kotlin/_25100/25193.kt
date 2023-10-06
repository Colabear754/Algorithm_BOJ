package _25100

import kotlin.math.ceil

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    println(readLine().run { ceil(count { it == 'C' }.toDouble()/(count { it != 'C' } + 1)).toInt() })
}