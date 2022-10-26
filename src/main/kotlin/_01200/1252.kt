package _01200

import java.math.BigInteger

fun main() {
    val n = readln().split(" ")
    println(BigInteger(n[0], 2).plus(BigInteger(n[1], 2)).toString(2))
}