package _01200

import kotlin.math.max

fun main() {
    val s = readln().split(" ").map { it.toInt() }
    val count = IntArray(81)
    for (i in 1 .. s[0]) {
        for (j in 1 .. s[1]) {
            for (k in 1 .. s[2]) {
                count[i + j + k]++
            }
        }
    }
    var max = 0
    for (i in count.indices) {
        max = max(max, count[i])
    }
    println(count.indexOf(max))
}