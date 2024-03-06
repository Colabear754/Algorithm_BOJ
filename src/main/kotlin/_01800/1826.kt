package _01800

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val gasStation = Array(n) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }.sortedArrayWith(compareBy { it[0] })
    var (l, p) = readLine().split(' ').map { it.toInt() }
    val pq = PriorityQueue<Int>(reverseOrder())
    var result = 0
    var index = 0
    while (p < l) {
        while (index < n && gasStation[index][0] <= p) {
            pq.add(gasStation[index][1])
            index++
        }
        if (pq.isEmpty()) {
            println(-1)
            return@with
        }
        p += pq.poll()
        result++
    }
    println(result)
}