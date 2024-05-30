package _14700

import kotlin.math.ceil
import kotlin.math.log2

fun main() = with(System.`in`.bufferedReader()) {
    var k = readLine().toInt()
    var n = 2
    var count = 0
    while (k != 1) {
        while (k % n == 0) {
            count++
            k /= n
        }
        n++
    }
    println(ceil(log2(count.toDouble())).toInt())
}