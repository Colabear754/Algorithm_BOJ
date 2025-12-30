package _13300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val students = Array(2) { IntArray(7) }
    repeat(n) { StringTokenizer(readLine()).run { students[nextToken().toInt()][nextToken().toInt()]++ } }
    println(students.sumOf { it.sumOf { grade -> (grade + k - 1) / k } })
}