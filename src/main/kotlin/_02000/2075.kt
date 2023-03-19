package _02000

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pq = PriorityQueue<Int>(reverseOrder()).apply {
        repeat(n) { StringTokenizer(readLine()).apply { while (hasMoreTokens()) add(nextToken().toInt()) } }
    }
    repeat(n - 1) { pq.poll() }
    println(pq.poll())
}