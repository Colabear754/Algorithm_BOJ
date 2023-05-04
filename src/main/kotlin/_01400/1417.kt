package _01400

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt() - 1
    val dasom = readLine().toInt()
    val numberOfVotes = PriorityQueue<Int>(reverseOrder()).apply { repeat(n) { add(readLine().toInt()) } }
    var count = 0
    while (dasom + count <= (numberOfVotes.peek() ?: 0)) {
        numberOfVotes.add(numberOfVotes.poll() - 1)
        count++
    }
    println(count)
}