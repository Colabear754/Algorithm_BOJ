package _10800

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val set = TreeSet(readLine().split(' ').map { it.toInt() })
    println(set.joinToString(" "))
}