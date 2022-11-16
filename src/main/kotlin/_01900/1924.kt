package _01900

import java.time.LocalDate

fun main() = print(readln().split(" ").map { it.toInt() }.let { LocalDate.of(2007, it[0], it[1]).dayOfWeek.toString().substring(0, 3) })