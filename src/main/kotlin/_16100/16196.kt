package _16100

import java.time.LocalDate

fun main() = with(System.`in`.bufferedReader()) {
    try {
        val id = readLine()
        val localCodes = IntArray(readLine().toInt()) { readLine().toInt() }
        if (id.take(6).toInt() !in localCodes) {
            throw RuntimeException()
        }
        val birthday = LocalDate.of(id.substring(6, 10).toInt(), id.substring(10, 12).toInt(), id.substring(12, 14).toInt())
        if (birthday.isBefore(LocalDate.of(1900, 1, 1)) || birthday.isAfter(LocalDate.of(2011, 12, 31))) {
            throw RuntimeException()
        }
        val orderCode = id.substring(14, 17).toInt()
        if (orderCode == 0) {
            throw RuntimeException()
        }
        var checkSum = id.last().let { if (it == 'X') 10 else it - '0' }
        id.take(17).forEachIndexed { i, c -> checkSum += (c - '0') shl (17 - i) }
        if ((checkSum - 1) % 11 != 0) {
            throw RuntimeException()
        }
        println(if (orderCode and 1 == 1) "M" else "F")
    } catch (e: Exception) {
        println("I")
    }
}