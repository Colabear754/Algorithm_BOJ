package _29800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val students = ArrayDeque<Student>()
    repeat(readLine().toInt()) { students.addLast(StringTokenizer(readLine()).run { Student(nextToken(), nextToken().toInt()) }) }
    while (students.size > 1) {
        val student = students.removeFirst()
        repeat(student.number - 1) { students.addLast(students.removeFirst()) }
        students.removeFirst()
    }
    println(students.first().name)
}

private class Student(val name: String, val number: Int)