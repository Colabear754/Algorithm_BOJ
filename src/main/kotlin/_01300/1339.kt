package _01300

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val charNumber = IntArray(26)
    repeat(n) {
        var digit = 1
        val input = readLine()
        for (i in input.lastIndex downTo 0) {
            charNumber[input[i] - 'A'] += digit
            digit *= 10
        }
    }
    val pq = PriorityQueue<Int>(reverseOrder()).apply { charNumber.forEach { if (it > 0) add(it) } }
    var result = 0
    var number = 9
    while (pq.isNotEmpty()) {
        result += pq.poll() * number--
    }
    println(result)
}