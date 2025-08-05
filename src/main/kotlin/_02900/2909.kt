package _02900

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() = with(System.`in`.bufferedReader()) {
    val (c, k) = readLine().split(' ').map { it.toInt() }
    val bill = 10.0.pow(k)
    println((c / bill).roundToInt() * bill.toInt())
}