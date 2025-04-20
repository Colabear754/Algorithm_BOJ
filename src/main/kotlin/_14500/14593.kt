package _14500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val participants = Array(n) {
        StringTokenizer(readLine()).run { Participant(it + 1, nextToken().toInt(), nextToken().toInt(), nextToken().toInt()) }
    }.apply { sort() }
    println(participants.first().index)
}

private class Participant(val index: Int, val score: Int, val count: Int, val time: Int) : Comparable<Participant> {
    override fun compareTo(other: Participant): Int {
        if (score != other.score) return other.score - score
        if (count != other.count) return count - other.count
        return time - other.time
    }
}