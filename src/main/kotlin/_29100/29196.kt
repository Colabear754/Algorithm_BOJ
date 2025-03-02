package _29100

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().split('.')
    println("YES\n${k[1].toInt()} ${10.0.pow(k[1].length).toInt()}")
}