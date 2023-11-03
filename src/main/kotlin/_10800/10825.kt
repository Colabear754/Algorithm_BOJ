package _10800

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val students = PriorityQueue<Student>(compareBy({ -it.korean }, { it.english }, { -it.math }, { it.name }))
    repeat(readLine().toInt()) { students.add(Student(StringTokenizer(readLine()))) }
    while (students.isNotEmpty()) bw.write("${students.remove().name}\n")
    bw.close()
}

private class Student(st: StringTokenizer) {
    val name = st.nextToken()!!
    val korean = st.nextToken().toInt()
    val english = st.nextToken().toInt()
    val math = st.nextToken().toInt()
}