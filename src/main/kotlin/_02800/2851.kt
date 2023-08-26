package _02800

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    var score = 0
    var result = 0
    repeat(10) {
        score += readLine().toInt()
        if (100 - result >= abs(100 - score)) result = score
    }
    println(result)
}