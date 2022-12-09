package _01000

import kotlin.math.pow
import kotlin.system.exitProcess

val input = readln().split(' ').map { it.toInt() }
val r = input[1]
val c = input[2]
var cnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    Z(input[0], 0, 0)
}

fun Z(n: Int, x: Int, y: Int) {
    if (n == 1) {
        visit(x, y)
        visit(x + 1, y)
        visit(x, y + 1)
        visit(x + 1, y + 1)
        return
    }
    val pow = 2.0.pow(n).toInt()
    if (c >= x && c < x + pow && r >= y && r < y + pow) {
        val next = 2.0.pow(n - 1).toInt()
        Z(n - 1, x, y)
        Z(n - 1, x + next, y)
        Z(n - 1, x, y + next)
        Z(n - 1, x + next, y + next)
    } else {
        cnt += pow * pow
        return
    }
}

fun visit(x: Int, y: Int) {
    if (c == x && r == y) {
        println(cnt)
        exitProcess(0)
    }
    cnt++
}