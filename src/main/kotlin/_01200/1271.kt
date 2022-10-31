package _01200

import java.math.BigInteger

fun main() {
    val (n, m) = readln().split(" ").map { BigInteger(it) }
    val r = n.divideAndRemainder(m)
    println(r[0])
    println(r[1])
}