package _19500

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val meetings = Array(n) { StringTokenizer(readLine()).run { Meeting(nextToken().toInt(), nextToken().toInt()) } }.apply { sort() }
    val rooms = PriorityQueue<Int>().apply { add(meetings[0].end) }
    var result = 1
    for (i in 1..<n) {
        while (rooms.isNotEmpty() && rooms.peek() <= meetings[i].start) {
            rooms.poll()
        }
        rooms.add(meetings[i].end)
        result = maxOf(result, rooms.size)
    }
    println(result)
}

private class Meeting(val start: Int, val end: Int) : Comparable<Meeting> {
    override fun compareTo(other: Meeting) = if (this.start == other.start) this.end - other.end else this.start - other.start
}