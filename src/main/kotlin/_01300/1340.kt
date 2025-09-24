package _01300

import java.time.Duration
import java.time.LocalDateTime
import java.time.Month
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine(), ":, ")
    val month = Month.valueOf(st.nextToken().uppercase())
    val (day, year, hour, minute) = st.run { IntArray(4) { nextToken().toInt() } }
    val start = LocalDateTime.of(year, 1, 1, 0, 0)
    val today = LocalDateTime.of(year, month, day, hour, minute)
    println(Duration.between(start, today).toMinutes().toDouble() / Duration.between(start, start.plusYears(1)).toMinutes().toDouble() * 100)
}