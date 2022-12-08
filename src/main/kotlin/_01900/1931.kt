package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rooms = Array(readLine().toInt()) { StringTokenizer(readLine()).let { Room(it.nextToken().toInt(), it.nextToken().toInt()) } }.sortedArray()
    var cnt = 0
    var cur = 0
    for (room in rooms) {
        if (room.start >= cur) {
            cnt++
            cur = room.end
        }
    }
    println(cnt)
}

class Room(var start: Int, var end: Int) : Comparable<Room> {
    override fun compareTo(other: Room) = if (this.end == other.end) this.start - other.start else this.end - other.end
}