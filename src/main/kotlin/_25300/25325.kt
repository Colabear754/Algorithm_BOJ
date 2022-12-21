package _25300

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val students = HashMap<String, Int>()
    val pq = PriorityQueue<Student>()
    StringTokenizer(readLine()).apply {
        repeat(n) { students[nextToken()] = 0 }
    }

    repeat(n) {
        StringTokenizer(readLine()).apply {
            while (hasMoreTokens()) {
                nextToken().also { students[it] = students[it]?.plus(1) ?: 1 }
            }
        }
    }

    for (k in students.keys) {
        pq.add(Student(k, students[k] ?: 0))
    }

    while (pq.isNotEmpty()) {
        val temp = pq.poll()
        bw.write("${temp.name} ${temp.popularity}\n")
    }

    bw.close()
}

class Student(val name: String, var popularity: Int) : Comparable<Student> {
    override fun compareTo(other: Student) = if (this.popularity == other.popularity) this.name.compareTo(other.name) else other.popularity - this.popularity
}