package _01900

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val m = readLine().toInt()
    val n = readLine().toInt()
    var sn = -1
    var sum = 0
    for (i in m..n) {
        val sqrt = sqrt(i.toDouble())
        if (sqrt - sqrt.toInt() == 0.0) {
            if (sn == -1) {
                sn = i
            }
            sum += i
        }
    }
    println(if (sn == -1) sn else "${sum}\n${sn}")
}