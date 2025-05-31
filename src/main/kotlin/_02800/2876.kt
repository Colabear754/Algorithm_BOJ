package _02800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val students = Array(n) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
    var result = 0
    var grade = 1
    for (i in 1..5) {
        var current = 0
        var max = 0
        for ((a, b) in students) {
            if (a == i || b == i) current++
            else current = 0
            max = maxOf(max, current)
        }
        if (max > result) {
            result = max
            grade = i
        }
    }
    println("$result $grade")
}