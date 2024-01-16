package _01300

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val lectures = Array(n) {
        StringTokenizer(readLine()).run {
            nextToken()
            Lecture(nextToken().toInt(), nextToken().toInt())
        }
    }.sortedBy { it.start }
    val pq = PriorityQueue<Lecture>()
    var lectureRoomCount = 0
    for (lecture in lectures) {
        while (pq.isNotEmpty() && pq.peek().end <= lecture.start) {
            pq.poll()
        }
        pq.add(lecture)
        lectureRoomCount = maxOf(lectureRoomCount, pq.size)
    }
    println(lectureRoomCount)
}

private class Lecture(val start: Int, val end: Int) : Comparable<Lecture> {
    override fun compareTo(other: Lecture) = this.end - other.end
}
