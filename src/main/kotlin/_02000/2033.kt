package _02000

import kotlin.math.log10
import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toDouble()
    val length = (log10(n) + 1).toInt()
    for (i in 1 until length) {
        val pow = 10.0.pow(i)
        n = "%.0f".format(n / pow).toDouble() * pow
    }
    println(n.toInt())
}