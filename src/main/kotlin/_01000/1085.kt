package _01000

import kotlin.math.min

fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    println(min(x, min(y, min(w - x, h - y))))
}