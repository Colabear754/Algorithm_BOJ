package _26000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val waiting = ArrayDeque<Pair<Int, Int>>()
    val students = Array(3) { mutableListOf<Int>() }
    repeat(n) {
        StringTokenizer(readLine()).run {
            when (nextToken()) {
                "1" -> waiting.add(nextToken().toInt() to nextToken().toInt())
                "2" -> {
                    val (a, b) = waiting.removeFirst()
                    if (b == nextToken().toInt()) students[0].add(a)
                    else students[1].add(a)
                }
            }
        }
    }
    waiting.forEach { students[2].add(it.first) }
    students.forEach { it.sort() }
    println(students.joinToString("\n") { if (it.isEmpty()) "None" else it.joinToString(" ") })
}