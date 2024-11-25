package _25900

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    var c = readLine()[0]
    var count = 0
    for (char in "ILOVEYONSEI") {
        count += abs(char - c)
        c = char
    }
    println(count)
}