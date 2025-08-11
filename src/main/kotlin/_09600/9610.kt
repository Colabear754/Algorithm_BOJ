package _09600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0
    var axis = 0
    repeat(readLine().toInt()) {
        val (x, y) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        when {
            x > 0 && y > 0 -> q1++
            x < 0 && y > 0 -> q2++
            x < 0 && y < 0 -> q3++
            x > 0 && y < 0 -> q4++
            else -> axis++
        }
    }
    println("Q1: $q1\nQ2: $q2\nQ3: $q3\nQ4: $q4\nAXIS: $axis")
}