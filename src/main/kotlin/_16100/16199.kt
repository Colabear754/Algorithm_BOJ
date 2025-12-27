package _16100

import java.time.LocalDate
import java.time.Period

fun main() = with(System.`in`.bufferedReader()) {
    val (y1, m1, d1) = readLine().split(" ").map { it.toInt() }
    val (y2, m2, d2) = readLine().split(" ").map { it.toInt() }
    println("${Period.between(LocalDate.of(y1, m1, d1), LocalDate.of(y2, m2, d2)).years}\n${y2 - y1 + 1}\n${y2 - y1}")
}