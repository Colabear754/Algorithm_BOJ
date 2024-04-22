package _29100

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val toSolve = IntArray(1) + StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } }
    val problems = Array(6) { PriorityQueue<Int>() }
    repeat(n) {
        StringTokenizer(readLine()).apply { problems[nextToken().toInt()].add(nextToken().toInt()) }
    }
    var result = 0
    for (i in 1..5) {
        val pq = problems[i]
        result += pq.peek()
        var prev = pq.poll()
        repeat(toSolve[i] - 1) {
            result += pq.peek()
            result += pq.peek() - prev
            prev = pq.poll()
        }
        result += 60
    }
    println(result - 60)
}