package _13300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val students = Array(7) { IntArray(2) }
    repeat(n) {
        val (s, y) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        students[y][s]++
    }
    var result = (students[1].sum() + students[2].sum() + k - 1) / k
    result += (students[3][0] + students[4][0] + k - 1) / k
    result += (students[3][1] + students[4][1] + k - 1) / k
    result += (students[5][0] + students[6][0] + k - 1) / k
    result += (students[5][1] + students[6][1] + k - 1) / k
    println(result)
}