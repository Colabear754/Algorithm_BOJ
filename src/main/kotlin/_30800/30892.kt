package _30800

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k, t) = readLine().split(' ').map { it.toInt() }
    val sharks = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }.apply { sort() }
    var size = t.toLong()
    var count = 0
    var index = 0
    val pq = PriorityQueue<Long>(reverseOrder())
    while (count < k) {
        while (index < n && sharks[index] < size) {
            pq.add(sharks[index++])
        }
        if (pq.isEmpty()) break
        size += pq.poll()
        count++
    }
    println(size)
}