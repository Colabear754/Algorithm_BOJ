package _12700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val students = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val waiting = ArrayDeque<Int>()
    var current = 1
    for (student in students) {
        if (student == current) {
            current++
            while (waiting.isNotEmpty() && waiting.last() == current) {
                waiting.removeLast()
                current++
            }
        } else {
            waiting.addLast(student)
        }
    }
    println(if (waiting.isEmpty()) "Nice" else "Sad")
}