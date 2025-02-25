package _22800

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val buses = Array(n) { StringTokenizer(readLine()).run { nextToken().millisecond to nextToken().millisecond } }
    buses.sortBy { it.first }
    val pq = PriorityQueue<Pair<Int, Int>> { a, b -> a.second - b.second }
    var stationCount = 0
    for (bus in buses) {
        pq.add(bus)
        while ((pq.peek()?.second ?: Int.MAX_VALUE) <= bus.first) {
            pq.poll()
        }
        stationCount = maxOf(stationCount, pq.size)
    }
    println(stationCount)
}

private val String.millisecond get() =
    StringTokenizer(this, ":.").run {
        nextToken().toInt() * 3600000 + nextToken().toInt() * 60000 + nextToken().toInt() * 1000 + nextToken().toInt()
    }