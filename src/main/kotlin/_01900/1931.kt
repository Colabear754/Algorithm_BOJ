package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val meetings = Array(readLine().toInt()) { StringTokenizer(readLine()).let { Meeting(it.nextToken().toInt(), it.nextToken().toInt()) } }.sortedArray()
    var cnt = 0
    var cur = 0
    for (room in meetings) {
        if (room.start >= cur) {
            cnt++
            cur = room.end
        }
    }
    println(cnt)
}

class Meeting(var start: Int, var end: Int) : Comparable<Meeting> {
    override fun compareTo(other: Meeting) = if (this.end == other.end) this.start - other.start else this.end - other.end
}